import java.util.Scanner;
public class ToOneHundred {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int number = 0;
        while (number < 100){
            number = number + 2;
            System.out.println(number);
        }
    }
}
