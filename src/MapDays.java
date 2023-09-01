import java.util.Scanner;

public class MapDays {
    public static void main(String[] args) {
        String day="";
        Scanner obj= new Scanner(System.in);
        int day_num =obj.nextInt();
        if (day_num==1){
            day= "Sunday";
        } else if (day_num == 2) {
            day = "Monday";
        } else if (day_num == 3) {
            day = "Tuesday";
        } else if (day_num == 4) {
            day = "Wednesday";
        }else if (day_num == 5) {
            day = "Thursday";
        } else if (day_num == 6) {
            day = "Friday";
        } else if (day_num == 7) {
            day = "Saturday";
        }
        else {
            System.out.println("Invalid input");
        }
        System.out.println(day);

    }
}


