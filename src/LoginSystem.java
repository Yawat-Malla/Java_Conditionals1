
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String user_name = "Yawat";
        String user_password = "Yawat";
        Scanner obj = new Scanner(System.in);
        System.out.println("Username: ");
        String req_name = obj.nextLine();
        System.out.println("Password: ");
        String req_password = obj.nextLine();
        if (req_name.equals(user_name) & req_password.equals(user_password)) {
            System.out.println("Welcome Yawat");
        }
        else{
            System.out.println("Username or password invalid.");
        }

    }
}
