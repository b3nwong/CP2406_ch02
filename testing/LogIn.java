import java.util.Scanner;
public class LogIn {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your username: ");
        String username = reader.nextLine();

        if (username.equals("alex")){
            System.out.print("Type your password: ");
            String password = reader.nextLine();
            if (!(password.equals("mightyducks"))){
                System.out.println("Wrong password!");
            }
            else{
                System.out.println("Password accepted!");
            }
        }

        else if (username.equals("emily")){
            System.out.print("Type your password: ");
            String password = reader.nextLine();
            if (!(password.equals("cats"))){
                System.out.println("Wrong password!");
            }
            else{
                System.out.println("Password accepted!");
            }

        }

        else{
            System.out.println("Wrong username!");
        }
    }
}
