package ClassAndObjectsPackage;

public class Passion {
    String name;
    int age;
    String profession;
    String city;

    public Passion(String name, int age, String profession, String city) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.city = city;
    }
    void passion(String passion)
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Profession : "+profession);
        System.out.println("City : "+city);
        System.out.println("He is an "+ passion);
    }

}
