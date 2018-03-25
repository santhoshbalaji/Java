import java.util.LinkedList;
import java.util.List;

public class Slide{
    public String pptname;
    public Slide(){

    }
    public void setpptName(String pptName) throws Exception {
        this.pptname = pptName;
    }
    public String getpptName(){
        return this.pptname;
    }
    public List<Slides> getSlides(String path) throws Exception {
        SlideParser s = new SlideParser();
        List<Slides> readConfig = s.parseXML(path);
        return readConfig;
    }
}