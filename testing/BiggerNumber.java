import java.util.Scanner;
public class BiggerNumber {
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        if (numberOne > numberTwo){
            System.out.println(numberOne + " is bigger.");
        }
        else{
            System.out.println(numberTwo + " is bigger.");
        }
    }
}
