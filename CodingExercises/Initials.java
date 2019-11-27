import java.util.Scanner;

public class Initials {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your three initials: ");
        //asks user to input their initials

        System.out.print("First initial: ");
        char initial1 = reader.next().charAt(0);
        //takes the users first initial

        System.out.print("Second initial: ");
        char initial2 = reader.next().charAt(0);
        //takes users second initial

        System.out.print("Third initial: ");
        char initial3 = reader.next().charAt(0);
        //takes users third initial

        System.out.println(initial1+"."+initial2+"."+initial3);
        //prints out the three initials given by the user
    }

}
