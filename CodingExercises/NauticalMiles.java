import java.util.Scanner;

public class NauticalMiles {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        double kilometersToNautical = 1.852;
        double milesToNautical = 1.150779;
        //Declares to 2 constant relative to nautical miles

        System.out.print("How many nautical miles have you travel?: ");
        double nauticalMiles = Double.parseDouble(reader.nextLine());
        //Gets the nautical miles the user wants to convert

        double toKilometers = nauticalMiles*kilometersToNautical;
        double toMiles = milesToNautical*nauticalMiles;
        //converts the user input into both km and miles

        System.out.println("The distance is " + toKilometers + " in kilometers.");
        System.out.println("The distance is " + toMiles + " in miles.");
    }
}
