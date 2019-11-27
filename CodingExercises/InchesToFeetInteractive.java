import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.print("How many inches would you like to convert?");
        int inches = Integer.parseInt(reader.nextLine());

        int inchToFeet = inches/12;
        //calculates how many feet from the inches as a whole number

        int remainder = inches%12;
        //calculates how many inches are left over that cant be represented in feet

        System.out.println("The length is " + inchToFeet + " feet and " + remainder + " inches long.");
    }
}
