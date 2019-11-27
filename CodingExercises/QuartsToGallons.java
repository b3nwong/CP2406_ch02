public class QuartsToGallons {

    public static void main(String[] args){
        int quarts = 18;

        int toGallons = quarts/4;
        int remainder = quarts%4;

        System.out.print("The volume needed is " + toGallons + " gallons");

        if (remainder == 0){
            System.out.print(".");
        }
        else{
            System.out.print(" " + remainder + " quarts.");
        }
    }
}
