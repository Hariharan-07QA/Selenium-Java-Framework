package Streams.java;

import java.util.StringTokenizer;

public class StringToken {

    public static void main(String[] args) {
        String starWarsQuote="May the force be with you!";
        System.out.println(" Using StringTokenizer");
        StringTokenizer stringTokenizer=new StringTokenizer(starWarsQuote);
        System.out.println("Number of Tokens :" + stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreTokens())
        {
            System.out.println(stringTokenizer.nextToken());
        }

        System.out.println("Using String Split");
        String [] starWarsQuoteWords = starWarsQuote.split(" ",4);
        System.out.println("Number of Words :" + starWarsQuoteWords.length);
        for (String starWarsQuoteWord:starWarsQuoteWords) {
            System.out.println(starWarsQuoteWord);
        }
    }
}
