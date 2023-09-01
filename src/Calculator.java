import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        double operation=0;
        System.out.println("Enter two numbers: ");
        Scanner obj = new Scanner(System.in);
        double num1 =  obj.nextInt();
        double num2 = obj.nextInt();
        System.out.println("Enter operator: ");
        System.out.println("+ for addition");
        System.out.println("- for subtraction");
        System.out.println("/ for division");
        System.out.println("x for multiplication");
        Scanner obj1 = new Scanner(System.in);
        String opt = obj1.nextLine();
        if(opt.equals("+")){
            operation = num1+num2;
        }
        else if(opt.equals("-")){
            operation = num1-num2;
        }
        else if(opt.equals("x")){
            operation = num1*num2;
        }
        else if(opt.equals("/")){
            operation = num1/num2;
        }
        else{
            System.out.println("invalid input");
        }
        System.out.println(operation);
    }
}
