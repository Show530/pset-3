import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fahrenheit :");
        float fahrenheit = in.nextFloat();
        float celsius = 5 / 9f * (fahrenheit - 32);
        float kelvin = (5 / 9f * (fahrenheit - 32)) + 273.15f;
        System.out.format("\nCelsius: %.2f", celsius);
        System.out.format("\nKelvin: %.2f", kelvin);
        in.close();
    }
}
