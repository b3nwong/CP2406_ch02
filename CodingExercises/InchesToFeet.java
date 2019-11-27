public class InchesToFeet {
    public static void main(String[] args){

        int inches = 86;
        int inchToFeet = inches/12;
        //calculates how many feet from the inches as a whole number

        int remainder = inches%12;
        //calculates how many inches are left over that cant be represented in feet

        System.out.println("The length is " + inchToFeet + " feet and " + remainder + " inches long.");

    }
}
