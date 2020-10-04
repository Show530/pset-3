import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Salary  : ");
        float salary = in.nextFloat();
        System.out.print("401(k)  : ");
        float retirement = in.nextFloat()/100f;
        System.out.print("Federal : ");
        float federal = in.nextFloat()/100f;
        System.out.print("State   : ");
        float state = in.nextFloat()/100f;
        float netPay = salary - ((retirement*salary));
        netPay = (netPay - ((federal*netPay) +(state*netPay)))/24f;
        System.out.printf("\n$%,.2f.\n", netPay);

        in.close();
    }
}
