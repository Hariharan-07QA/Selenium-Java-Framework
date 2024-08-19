package AutomationPractice;

import org.aeonbits.owner.ConfigFactory;

public class PropertyReaderWithOwner {

    public static void main(String[] args) {

        FrameWorkConfig config= ConfigFactory.create(FrameWorkConfig.class);
        System.out.println(config.username());
        System.out.println(config.password());
        System.out.println(config.timeout());
        System.out.println(config.url());
      String[]tools= config.tool();
        for (String tool:tools) {
            System.out.println(tool);
        }
    }
}
