import java.util.Scanner;

public class Program {
    public class Authenticator {


        public static void main(String[] args) {

            String login;

            String password;

            Scanner scan = new Scanner(System.in);



            System.out.println("login:");

            login = scan.next();

            System.out.println("password:");

            password = scan.next();



            if(login.equals("user") && password.equals("qwerty")){

                System.out.println("Authentication completed");

            }else{

                System.out.println("Invalid login or password");

            }
            scan.close();
        }
    }
}



