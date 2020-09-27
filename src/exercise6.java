import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wage:");
        float wage = in.nextFloat();
        System.out.println("Monday:");
        float mondayHours = in.nextFloat();
        System.out.println("Tuesday:");
        float tuesdayHours = in.nextFloat();
        System.out.println("Wednesday:");
        float wednesdayHours = in.nextFloat();
        System.out.println("Thursday:");
        float thursdayHours = in.nextFloat();
        System.out.println("Friday:");
        float fridayHours = in.nextFloat();
        System.out.println("Saturday:");
        float saturdayHours = in.nextFloat();
        System.out.println("Sunday:");
        float sundayHours = in.nextFloat();
        float totalPay= wage*(mondayHours+tuesdayHours+wednesdayHours+thursdayHours+fridayHours+saturdayHours+sundayHours);
        System.out.format("$%.2f.", totalPay);

        in.close();
    }
}