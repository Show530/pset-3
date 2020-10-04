import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Wage      : ");
        float wage = in.nextFloat();
        System.out.print("Monday    : ");
        float mondayHours = in.nextFloat();
        System.out.print("Tuesday   : ");
        float tuesdayHours = in.nextFloat();
        System.out.print("Wednesday : ");
        float wednesdayHours = in.nextFloat();
        System.out.print("Thursday  : ");
        float thursdayHours = in.nextFloat();
        System.out.print("Friday    : ");
        float fridayHours = in.nextFloat();
        System.out.print("Saturday  : ");
        float saturdayHours = in.nextFloat();
        System.out.print("Sunday    : ");
        float sundayHours = in.nextFloat();
        float totalPay= wage*(mondayHours+tuesdayHours+wednesdayHours+thursdayHours+fridayHours+saturdayHours+sundayHours);
        System.out.format("\n$%.2f.\n", totalPay);

        in.close();
    }
}