import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = obj.nextInt();
        System.out.println("Enter second number");
        int num2 = obj.nextInt();
        if(num1>num2){
            System.out.println(num1+" is the greatest.");
        }
        else if(num2>num1){
            System.out.println(num2 + " is the greatest.");
        }
        else{
            System.out.println("Both numbers are equal.");
        }
    }
}
