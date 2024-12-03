import java.util.Scanner;

public class bmrconverter {
    public static void main(String[] args) {

                double maleBMR , womenBMR;

                System.out.println("I can covert your specific bmr?!");
                System.out.println("Type your height in centimeter");
                Scanner keyboard = new Scanner(System.in);
                int heightInCentimeter = keyboard.nextInt();
                System.out.println("type your weight in kilograms");
                int weightInKilo = keyboard.nextInt();
                System.out.println("Type your age in years");
                int age = keyboard.nextInt();

                System.out.println("Are you a male or female?");
                if("Male".equals(keyboard.next())){

                    maleBMR = 66.5 + (13.75 * weightInKilo) + (5 * heightInCentimeter) - (6.75 * age);
                    System.out.println("Your bmr is " + maleBMR);
                }
                else{
                    womenBMR = 655.1 + (9.563 * weightInKilo) + (1.85 * heightInCentimeter) - (4.676 * age);
                    System.out.println("Your bmr is " + womenBMR);
                }

            }
        }


