package AutomationPractice;

import java.util.Objects;

public class GenericsApp {

    public void show(Object[]objects)
    {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

    }
    public static void main(String[] args) {
        String []strings =new String[10];
        //GenericPractice <String,String>gp = new GenericPractice("Name","Hari");
        //System.out.println(gp.getKey()+" :"+gp.getValue());
//        GenericPractice <String> gp1=new GenericPractice<>();
//        gp1.setType("Hari");
//        System.out.println(gp1.getType());
        GenericsApp app=new GenericsApp();
        strings[0]="Havidol";
        app.show(strings);

    }
}
