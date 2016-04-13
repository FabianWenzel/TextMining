import java.util.List;

/**
 *
 * @author kai
 */
public class Monolog {
    private String speaker;
    private List<String> path;
    private String text;

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public List<String> getPath() {
        return path;
    }

    public void setPath(List<String> path) {
        this.path = path;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Monologue{" + "speaker=" + speaker + ", path=" + path + ", text=" + text + "}\n";
    }





}