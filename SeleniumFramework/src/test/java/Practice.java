public class Practice {

  static  String CmpName = "Grid Dynamics";
  String empName;
  int age;
  Practice(String empName,int age)
  {
      this.empName=empName;
      this.age=age;
  }

    public static void main(String[] args) {
        int c=30;



        Practice p=new Practice("Praveena",26);
        System.out.println(p.empName);
        System.out.println(p.age);
        System.out.println(CmpName);

    }
}
