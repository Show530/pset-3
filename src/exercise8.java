import java.util.Scanner;

public class exercise8{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Students:");
        int students = in.nextInt();
        System.out.println("Teachers:");
        int teachers = in.nextInt();
        System.out.println("Capacity:");
        int capacityOfBus = in.nextInt();
        int busesRequired= (students + teachers+ (capacityOfBus-1))/capacityOfBus;
        int overflow= (students + teachers)%capacityOfBus;
        System.out.format("\nBuses required : " + busesRequired);
        System.out.format("\nOverflow passengers : " + overflow);
        in.close();
    }
}