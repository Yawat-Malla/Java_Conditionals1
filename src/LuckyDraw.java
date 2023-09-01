import java.util.Random;
import java.util.Scanner;

public class LuckyDraw{
    public static void main(String[] args) {
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + " Prizes");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\tPrize\t\t\t\t\t\t\t\t\t Token no.\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tSamsung S23 Ultra\t\t\t\t\t\t\t39");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tCasio F-91W Watch\t\t\t\t\t\t 05-10");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tEarPods\t\t\t\t\t\t\t\t\t 20-30");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tUnlimited Food\t\t\t\t\t\t\t 32-38");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tFree Coffee\t\t\t\t\t\t\t\t 40-60");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tDiscount Cupon\t\t\t\t\t\t\t70-100");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tBat Man Model\t\t\t\t\t\t\t 01-04");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tBarbie Doll\t\t\t\t\t\t\t\t 10-19");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tFree Cold Drinks\t\t\t\t\t\t 61-69");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tFree movie tickets\t\t\t\t\t\t 11-19");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tBUMPER PRIZE--->31\t\t\t\t\t\t\t\t\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t************MacBook Pro************");
        System.out.println("Press Enter Key to try your luck!");
        Scanner obj = new Scanner(System.in);
        obj.nextLine();
        Random xyz=new Random();
        int luck= xyz.nextInt(101);
        if (luck==31)
        {
            System.out.println("Congratulations!!! Your've won the Bumper prize with your lucky token "+luck);
        } else if (luck==39) {
            System.out.println("Congratulations!!! Your've won the Samsung S23 Ultra with your lucky token "+luck);
        } else if (luck>=5 & luck<=10) {
            System.out.println("Congratulations!!! Your've won the Casio F-91W Watch with your lucky token "+luck);
        } else if (luck>=20 & luck<=30) {
            System.out.println("Congratulations!!! Your've won A earpod with your lucky token "+luck);
        } else if (luck>=32 & luck<=38) {
            System.out.println("Congratulations!!! Your've won Unlimited food for a day with your lucky token "+luck);
        } else if (luck>=40 & luck<=60) {
            System.out.println("Congratulations!!! Your've won Free Coffee with your lucky token "+luck);
        } else if (luck>=70 & luck<=100) {
            System.out.println("Congratulations!!! Your've won Discount Cupon with your lucky token "+luck);
        } else if (luck>=1 & luck<=4) {
            System.out.println("Congratulations!!! Your've won Bat Man with your lucky token "+luck);
        } else if (luck>=10 & luck<=19) {
            System.out.println("Congratulations!!! Your've won pinky Barbie with your lucky token "+luck);
        } else if (luck>=61 & luck<=69) {
            System.out.println("Congratulations!!! Your've won Free Drink with your lucky token "+luck);
        } else if (luck>=11 & luck<=19) {
            System.out.println("Congratulations!!! Your've won Free Movie ticket with your lucky token "+luck);
        }
        System.out.println("\nWant to Try Again?");

    }
}