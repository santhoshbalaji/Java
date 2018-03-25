import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedHashMap;
import java.util.List;
public class XMLtoHTML{
    public XMLtoHTML(){
    }
    public void toHTML(String path) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("XMLtoHTML.html")));
        Slide s = new Slide();
        List<Slides> list = s.getSlides(path);
        String color[] = {"#D93B65","#037E8C","#36BF66","#e8724d"};
        String htmlcontent = "<html><head><title>PPT</title></head><link rel = 'stylesheet' href = 'XMLtoHTML.css' >";
        htmlcontent += "<body onkeyup='slide(event)' ><main><div id='slideshow'><div class='slide-wrapper' id = 'SlideDiv' ><div class = 'slide' id = 'FirstDiv' >Welcome</div> ";
        int index = (int)Math.round(Math.random() * 4 );
        for(Slides slides : list){
            if(index >= color.length){
                index = 0;
            }
            LinkedHashMap<String,String> lhm = slides.slideValues();
            htmlcontent += "<div class='slide' style = 'background:"+color[index]+"' >";
            htmlcontent += "<h1>"+slides.slideValues().get("pptName")+" Presentation</h1><hr>";
            htmlcontent += "<h2>"+slides.slideValues().get("className")+"</h2>";
            htmlcontent += "<h3>"+slides.slideValues().get("heading")+":</h3><ul>";
            htmlcontent += "<li>"+slides.slideValues().get("bullet1")+"</li>";
            htmlcontent += "<li>"+slides.slideValues().get("bullet2")+"</li>";
            htmlcontent += "<li>"+slides.slideValues().get("bullet3")+"</li></ul></div>";
            index++;
        }
        htmlcontent += " <div class = 'slide' id = 'LastDiv' >Thank You!</div></div></main><script src = 'XMLtoHTML.js' ></script></body></html>";
        writer.write(htmlcontent);
        writer.flush();
        writer.close();
    }
}