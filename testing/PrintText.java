import java.util.Scanner;

public class PrintText {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("How many?: ");
        int numberOfTexts = Integer.parseInt(reader.nextLine());
        for (int i = 0; i<numberOfTexts; i++){
            printText();
        }

    }

    private static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
