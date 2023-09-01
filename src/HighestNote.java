import java.util.Scanner;

public class HighestNote {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amount = obj.nextInt();
        int thousand = amount / 1000;
        amount = amount%1000;
        int f_hundred = amount / 500;
        amount = amount%500;
        int hundred = amount / 100;
        amount = amount%100;
        int fifty = amount / 50;
        amount = amount%50;
        int twenty = amount /20;
        amount = amount%20;
        int ten = amount/10;
        amount = amount%10;
        int five = amount/5;
        amount = amount%5;
        int t_rs = amount/2;
        amount = amount% 2;
        int o_rs = amount;
        System.out.println("Thousand Note: "+ thousand);
        System.out.println("Five Hundred Note: "+ f_hundred);
        System.out.println("Hundred Note: "+ hundred);
        System.out.println("Fifty Note: "+ fifty);
        System.out.println("Twenty Note: "+ twenty);
        System.out.println("Ten Note: "+ ten);
        System.out.println("Five Note: "+ five);
        System.out.println("Two coin: "+ t_rs);
        System.out.println("One Coin: "+ o_rs);
    }
}
