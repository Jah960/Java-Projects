import java.util.Scanner;

public class GradeAverager {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("I can track your tests and grades averages! Please put the number of tests you have");
        int numOfTests = keyboard.nextInt();
        int[] grades = new int[numOfTests];
        int sum = 0;

        for (int i = 0; i < numOfTests; i++) {
            System.out.println("Please enter test " + i + " ");
            grades[i] = keyboard.nextInt();
            sum = + grades[i];

        }

        double average = (double) sum / numOfTests;
        System.out.println("Your average is " + average + " ");

        for (int i = 0; i < numOfTests; i++) {
            System.out.println("Test " + i + " : " + grades[i]);
            if(grades[i] > average){
                System.out.println("Above Average!");
            }
            else if(grades[i] < average){
                System.out.println("below Average!");
            }
            else{
                System.out.println("Average");
            }
        }
    }
}
