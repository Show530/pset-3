import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Height:");
        float height = in.nextFloat()*25.4f;
        System.out.println("Width:");
        float width = in.nextFloat()*25.4f;
        float area =width*height;
        System.out.format("%,.2f square millimeters.", area);

        in.close();
    }
}
