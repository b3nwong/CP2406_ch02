import java.util.Scanner;
public class PositiveNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if (number > 0) {
            System.out.println("This number is positive.");
        }
        else {
            System.out.println("This number is negative.");
        }
    }
}