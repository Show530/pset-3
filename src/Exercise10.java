import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Fahrenheit : ");
        float fahrenheit = in.nextFloat();
        float celsius = 5 / 9f * (fahrenheit - 32);
        float kelvin = (5 / 9f * (fahrenheit - 32)) + 273.15f;
        System.out.printf("\nCelsius : %.2f", celsius);
        System.out.printf("\nKelvin  : %.2f\n", kelvin);
        in.close();
    }
}
