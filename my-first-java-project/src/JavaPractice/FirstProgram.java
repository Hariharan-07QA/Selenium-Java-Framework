package JavaPractice;

public class FirstProgram {
    int a=10;
    static String powerConsumption(char power) {
        switch (power) {
            case 'a':
            case 'A':
                return "Power is low";

            case 'b':
            case 'B':
                return "Power is Very low";

            case 'c':
            case 'C':
                return "Power is Normal";


            case 'd':
            case 'D':
                return "Power is Above normal";

            case 'e':
            case 'E':
                return "Power is high";

            case 'f':
            case 'F':
                return "Power is Very high";

            case 'g':
            case 'G':
                return "Power is Extremely high";
            default:
                return "No Power";
        }
    }

    public static void main(String[] args) {
//        char option ='c';
//        String question ="Who is named as father of the light bulb";
//        switch(option)
//        {
//            case'c':{
//                System.out.println("Correct answer");
//                break;
//            }
//            default:
//                System.out.println("Wrong answer");
//        }
        System.out.println(FirstProgram.powerConsumption('E'));

    }
}
