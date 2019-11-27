import java.util.Scanner;
public class CalcCircum {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        double circumference = 2 * Math.PI * radius;

        System.out.println("The circumference is " + circumference);

    }
}
