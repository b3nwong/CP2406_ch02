import java.util.Scanner;

public class ChilliToGo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many adult meals?: ");
        int adultMeal = Integer.parseInt(reader.nextLine());
        //user to input adult meal orders

        System.out.println("How many children's meals?: ");
        int childMeal = Integer.parseInt(reader.nextLine());
        //user to input child meal orders

        float adultPrice = adultMeal*7;
        float childPrice = childMeal*4;

        float totalPrice = adultPrice+childPrice;
        //total amount to be collected

        System.out.println("The amount will be $" + adultPrice + " for " + adultMeal + " adult meals, and $" + childPrice + " for " + childMeal + " children's meals. The total amounts to $" + totalPrice + ".");

    }
}
