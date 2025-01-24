import java.util.Scanner;


public class videogamebuyer {
    public static void main(String[] args) {
        String title, description;
        int year,  videoGameSelection;
        double cost, finalcost;


        Scanner keyboard = new Scanner(System.in);


        System.out.println("Welcome to Vapor! What game would you like to buy?");
        System.out.println("(1) Valorant");
        System.out.println("(2) Bayonetta 3");
        System.out.println("(3) Bus simulator 21");
        System.out.println("(4) Rocket League");
        videoGameSelection = keyboard.nextInt();


        //phase 2 > calculations
        switch (videoGameSelection) {
            case 1 -> {
                title = "Valorant";
                year = 2020;
                cost = 10.0;
                description = "Tactical shooter";


            }
            case 2 -> {
                title = "Bayonetta 3";
                year = 2023;
                cost = 59.99;
                description = "Cmon chesheir, lets go!";


            }
            case 3 -> {
                title = "Bus Simulator 21";
                year = 2021;
                cost = 19.99;
                description = "Drive to your hearts content";


            }
            case 4 -> {
                title = "Rocket League";
                year = 2015;
                cost = 10.00;
                description = "Race for the ball!";


            }
            default -> {
                title = "No game chosen";
                year = 0;
                cost = 0;
                description = "None";


            }


        }




        System.out.println("Title: " +title);
        System.out.println("Year: " +year);
        System.out.println("Description: " +description);
        finalcost = cost * 1.08625;
        System.out.printf("The final cost of the game with sales tax is: %1.2f " , finalcost);
    }
}


