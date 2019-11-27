import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How many eggs would you like to purchase?: ");
        int eggs = Integer.parseInt(reader.nextLine());
        //asks user to input number of eggs they would like to order

        int dozenEggs = eggs/12;
        //sorts eggs by the dozen

        int looseEggs = eggs%12;
        //accounts for the loose eggs not in the dozen

        float finalPrice = (float) (dozenEggs*3.25 + looseEggs*.45);
        //calculate price paid for the dozens and loose eggs

        System.out.println("You ordered " + eggs + " eggs. That's " + dozenEggs + " dozen at $3.25 per dozen and " + looseEggs + " loose eggs at $0.45 each for a total of $" + finalPrice + ".");

    }
}
