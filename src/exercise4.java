import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Height:");
        float height =in.nextFloat()*2.54f;
        System.out.println("Width:");
        float width = in.nextFloat()*2.54f;
        float area =2f*(width)+2f*(height);
        System.out.format("%,.2f square millimeters.", area);

        in.close();
    }
}