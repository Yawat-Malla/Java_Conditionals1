import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        Random random = new Random();
        int random_number = random.nextInt(max - min+ 1) + min;
        Scanner obj = new Scanner (System.in);
        System.out.println("Guess a number between " + min + " and " + max + ": " );
        int guess_num = obj.nextInt();
        if(guess_num==random_number){
            System.out.println(("Your guess is correct!. The number was "+ random_number));
        }
        else if(guess_num!=random_number & guess_num>=0 & guess_num<=100){
            System.out.println("Your guess is incorrect. The number was "+random_number);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
