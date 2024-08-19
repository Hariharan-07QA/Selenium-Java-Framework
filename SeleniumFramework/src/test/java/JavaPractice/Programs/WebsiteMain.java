package JavaPractice.Programs;

import javax.print.attribute.standard.MediaSize;

public class WebsiteMain {
    public static void main(String[] args) {
        MultiThreading offers=new MultiThreading("Offers");
        MultiThreading sales=new MultiThreading("Sales");
        MultiThreading recentSearches=new MultiThreading("Recent Searches");

        //For Start method both the thread executes parallel.
        offers.start();
        sales.start();
        recentSearches.start();
        // If we use run method it executes in sequential order first thread will execute first and then execute the next thread.
//        thread1.run();
//        thread2.run();
    }
}
