import java.util.Scanner;

public class ChilliToGoProfit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many adult meals?: ");
        int adultMeal = Integer.parseInt(reader.nextLine());
        //user to input adult meal orders

        System.out.println("How many children's meals?: ");
        int childMeal = Integer.parseInt(reader.nextLine());
        //user to input child meal orders

        float adultProfit = (float) (adultMeal*2.65);
        float childProfit = (float) (childMeal*0.9);

        float totalProfit = adultProfit+ childProfit;
        //total amount to be collected

        System.out.println("The profits will be $" + adultProfit + " for " + adultMeal + " adult meals, and $" + childProfit + " for " + childMeal + " children's meals. The total profit to $" + totalProfit + ".");

    }
}
