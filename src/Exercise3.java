import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Height : ");
        float height = in.nextFloat()*25.4f;
        System.out.print("Width  : ");
        float width = in.nextFloat()*25.4f;
        float area =width*height;
        System.out.printf("\n%,.2f square millimeters.\n", area);

        in.close();
    }
}
