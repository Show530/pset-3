import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Homework 1 : ");
        float homework1 = in.nextFloat();
        System.out.print("Homework 2 : ");
        float homework2 = in.nextFloat();
        System.out.print("Homework 3 : ");
        float homework3 = in.nextFloat();
        System.out.print("Quiz 1     : ");
        float quiz1 = in.nextFloat();
        System.out.print("Quiz 2     : ");
        float quiz2 = in.nextFloat();
        System.out.print("Test 1     : ");
        float test1 = in.nextFloat();
        float total= (float) (0.15*((homework1+homework2+homework3)/3) + 0.35*((quiz1+quiz2)/2) + 0.5*(test1));
        System.out.printf("\n%.2f%%.\n", total);

        in.close();
    }
}