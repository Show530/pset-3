import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Salary:");
        float salary = in.nextFloat();
        System.out.println("401(k):");
        float retirement = in.nextFloat()/100f;
        System.out.println("Federal:");
        float federal = in.nextFloat()/100f;
        System.out.println("State:");
        float state = in.nextFloat()/100f;
        float netPay = salary - ((retirement*salary));
        netPay = (netPay - ((federal*netPay) +(state*netPay)))/24f;
        System.out.format("$%,.2f.", netPay);

        in.close();
    }
}
