public class RightTriangle {
    public static void main(String[] args){
        printTriangles(4);
    }

    public static void printWhiteSpaces(int spaces) {
        for (int i = spaces; i > 0; i--) {
            System.out.print(" ");
        }
    }

    public static void printStars(int stars){
        for (int i=0; i<stars; i++){
            System.out.print("*");
        }
    }

    public static void printTriangles(int height){
        for (int i=1; i<=height; i++){
            printWhiteSpaces(height-i);
            printStars(i);
            System.out.println();
        }
    }

}
