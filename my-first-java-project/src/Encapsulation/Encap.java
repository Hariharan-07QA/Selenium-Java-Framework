package Encapsulation;

public class Encap {
    private int age;
    private String name="hari";
    private String profession;

    public void setProfession(String profession) {
        this.profession = profession;
    }

 public String getProfession()
 {
     return profession;
 }


    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
