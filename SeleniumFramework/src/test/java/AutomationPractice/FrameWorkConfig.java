package AutomationPractice;

import org.aeonbits.owner.Config;
@Config.Sources(value="file:C:/Users/sselvakumar/Intellij Java Project/SeleniumPractice/config.properties")
public interface FrameWorkConfig extends Config {

    String username();
    String password();
    String url();
    int timeout();
    String[]tool();


}
