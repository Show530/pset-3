import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Students : ");
        int students = in.nextInt();
        System.out.print("Teachers : ");
        int teachers = in.nextInt();
        System.out.print("Capacity : ");
        int capacityOfBus = in.nextInt();
        int busesRequired= (students + teachers+ (capacityOfBus-1))/capacityOfBus;
        int overflow= (students + teachers)%capacityOfBus;
        System.out.print("\nBuses required      : " + busesRequired);
        System.out.println("\nOverflow passengers : " + overflow);
        in.close();
    }
}