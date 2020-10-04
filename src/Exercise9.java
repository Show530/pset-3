import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Amount : ");
        float amount =in.nextFloat();
        int quarters = (int) (amount/.25);
        amount = (float) (amount % .25);
        int dimes = (int) (amount/.10);
        amount = (float) (amount % .10);
        int nickles = (int) (amount/ .05);
        amount = (float) (amount % .05);
        int pennies = (int) (amount/0.01);
        System.out.print("\nQuarters : " + quarters);
        System.out.print("\nDimes    : " + dimes);
        System.out.print("\nNickles  : " + nickles);
        System.out.println("\nPennies  : " + pennies);
        in.close();
    }
}