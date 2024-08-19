package JavaPractice.Programs;

public class MultiThreading extends Thread {

    private String moduleName;

    public MultiThreading(String moduleName)
    {
        this.moduleName=moduleName;
    }
    @Override
    public void run()
    {
        for (int i =5; i>0; i--) {
            System.out.println(moduleName+" module will be loaded in "+i+" Sec.");
            if(i==3 && "Sales".equals(moduleName))
            {
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
