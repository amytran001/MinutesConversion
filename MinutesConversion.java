// Step 1: Set up the main class and import the necessary packages
import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args){
        //Step 2: Declare variable for user input and conversion factors
        int minutes;
        double hours;
        double days;
        double MIN_IN_HR = 60;
        double HRS_IN_DAY = 24;
        //Step 3: Prompt the user for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes >> ");
        minutes = input.nextInt();
        // Step 4: perform the conversion
        hours = minutes / MIN_IN_HR;
        days = hours/ HRS_IN_DAY;
        // Step 5: Display the result
        System.out.println("minutes is " + hours + "hours or " + days + "days. " );
    }
}
