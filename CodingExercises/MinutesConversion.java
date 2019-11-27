import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //get how many minutes
        System.out.print("PLease enter how many minutes: ");
        int minutes = Integer.parseInt(reader.nextLine());

        //convert to hours
        int toHours = minutes/60;
        int remainderMins = minutes%60;

        //convert to days
        float toDays = ((float) minutes)/1440;

        System.out.println(minutes + " minutes equals " + toHours + " hours and " + remainderMins +", it also equals " + toDays + " days.");
    }
}
