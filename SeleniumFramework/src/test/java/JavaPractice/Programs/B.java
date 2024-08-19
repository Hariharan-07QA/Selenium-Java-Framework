package JavaPractice.Programs;

  public class B{

     private B(int x){
         System.out.println(x);
     }
      private class A{
          static  int y =10;
      }

      public static void main(String[] args) {
          B b=new B(10);
      }

}



