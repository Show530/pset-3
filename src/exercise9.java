import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Amount :");
        float amount =in.nextFloat();
        int quarters = (int) (amount/.25);
        amount = (float) (amount % .25);
        int dimes = (int) (amount/.10);
        amount = (float) (amount % .10);
        int nickles = (int) (amount/ .05);
        amount = (float) (amount % .05);
        int pennies = (int) (amount/0.01);
        System.out.format("\nQuarters : " + quarters);
        System.out.format("\nDimes : " + dimes);
        System.out.format("\nNickles : " + nickles);
        System.out.format("\nPennies : " + pennies);
        in.close();
    }
}