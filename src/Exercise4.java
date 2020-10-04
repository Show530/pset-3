import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Height : ");
        float height =in.nextFloat()*2.54f;
        System.out.print("Width  : ");
        float width = in.nextFloat()*2.54f;
        float area =2f*(width)+2f*(height);
        System.out.printf("\n%,.2f centimeters.\n", area);

        in.close();
    }
}