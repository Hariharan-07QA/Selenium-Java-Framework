package JavaPractice;

public class ImdbMovieRating {
    String name ="Joseph Vijay";
    String yearOfBorn="22-07-1974";
    int year=1974;
    int currentYear=2023;
    int age=currentYear-year;
    String [] movieTitles={"Mersal","Thuppakki","Master","Kaththi"};



    void movieTitles1(String[]movieTitles)
    {
        for (int i = 0; i < movieTitles.length; i++) {
            //System.out.println(movieTitles[i]+"-"+movieRatings(ratings););
        }
    }
    double [] ratings={7.5,8.1,7.3,8.1};
    void movieRatings(double[] ratings)
    {
        for (double rate:ratings)
        {
            if(rate<=5.0)
                System.out.println("Bad");
            else if (rate>5.0 && rate<=6.5)
                System.out.println("Average");
            else if (rate>6.5 && rate<=7.0)
                System.out.println("Good");
            else if (rate>7.0 && rate<=8.0)
                System.out.println("Very Good");
            else if(rate>8.0)
                System.out.println("Amazing");
        }
    }

    public static void main(String[] args) {
        ImdbMovieRating imdb=new ImdbMovieRating();
        System.out.println("Actor Name :" +imdb.name);
        System.out.println("Year of born :" +imdb.yearOfBorn);
        System.out.println("Age :" +imdb.age);






    }
}
