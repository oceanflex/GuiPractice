package firstgui;

/**
 *
 * @author zsummers
 */
public class MessageService {
    private String prefix = "Hello ";

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    public String addPrefix(String input){
        return prefix+input;
    }
}
