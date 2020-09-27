import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Homework 1:");
        float homework1 = in.nextFloat();
        System.out.println("Homework 2:");
        float homework2 = in.nextFloat();
        System.out.println("Homework 3:");
        float homework3 = in.nextFloat();
        System.out.println("Quiz 1:");
        float quiz1 = in.nextFloat();
        System.out.println("Quiz 2:");
        float quiz2 = in.nextFloat();
        System.out.println("Test 1:");
        float test1 = in.nextFloat();
        float total= (float) (0.15*((homework1+homework2+homework3)/3) + 0.35*((quiz1+quiz2)/2) + 0.5*(test1));
        System.out.format("%.2f %%.", total);

        in.close();
    }
}