import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Slides {
    private String pptName;
    private String className;
    private String heading;
    private LinkedList<String> bullets;

    public Slides() {
        bullets = new LinkedList<String>();
    }

    public void setpptName(String pptName) {
        this.pptName = pptName;
    }

    public void setclassName(String className) {
        this.className = className;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setBullet(String bullets) {
        this.bullets.add(bullets);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        // sb.append("PPT-Name--" + this.pptName);
        sb.append("--Class-Name--" + this.className);
        sb.append("--Heading--" + this.heading);
        for (int i = 0; i < bullets.size(); i++) {
            sb.append("--Bullet" + (i + 1) + "--" + bullets.get(i));
        }
        return new String(sb);
    }

    public LinkedHashMap<String, String> slideValues() {
        LinkedHashMap<String, String> list = new LinkedHashMap<String, String>();
        // list.put("pptName", this.pptName);
        list.put("pptName", this.pptName);
        list.put("className", this.className);
        list.put("heading", this.heading);
        for (int i = 0; i < bullets.size(); i++) {
            list.put("bullet" + (i + 1), bullets.get(i));
        }
        return list;
    }
}