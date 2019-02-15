//the first project in java programming 1:40 Am 15/2/2019

import java.util.Scanner;

public class TripInformation {
    public static final String midNight = "0:00";
    public static final String noon = "12:00";

    public static void main(String[] args) {
        greeting();
        travelTimeAndBudget();
        timeDifference();
        countryArea();

    }

    public static void greeting() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Whate is your name? ");
        String name = input.nextLine();
        System.out.println("Nice to meet you " + name);
        System.out.print("Where are you travelling to? ");
        String city = input.nextLine();
        System.out.println("Greet! " + city + " sounds like a great trip.");
        System.out.println("*******************");
    }

    public static void travelTimeAndBudget() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are they going to spend in their destination? ");
        int days = input.nextInt();
        System.out.print("What is their total budget for the trip in USD?");
        double money = input.nextDouble();
        System.out.print("What is the currency symbol for their destination? For example, the us dollar’s is USD, the euro’s is EU etc…");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 USD? ");
        double moneyCorrespondingUSD = input.nextDouble();
        System.out.println("If you are travelling for " + days + " days that is the same as " + (days * 24) + " hours or " + (days * 24 * 60) + " minutes");
        System.out.println("If you are going to spend $" + ((double)((int)(money*100))/100.0) + " USD that means per day you can spend up to " + (double)((int)((money / days)*100))/100.0 + " USD");
        System.out.println("Your total budget in " + symbol + " is " + (double)((int)((money * moneyCorrespondingUSD)*100))/100.0 + " " + symbol + ", which per day is " + (double)((int)((money * moneyCorrespondingUSD / days)/100))/100.0);
        System.out.println("********************");
    }

    public static void timeDifference() {
        Scanner input = new Scanner(System.in);
        System.out.print("What id the time difference, in hours, between your home and your destination? ");
        int time = input.nextInt();
        System.out.println("That means that when it is midnight at home it will be " +((24+time)%24) +":00 in your travel destination");
        System.out.println("and when it is noon at home it will be " +(12+time)%24 +":00");
    }
    public static void countryArea(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in Km^2? ");
        double distance = input.nextDouble();
        System.out.println("In miles^2 that is "+(((double)((int)(distance*0.621371192*100))/100.0)));
        System.out.println("**********************");
    }

}
