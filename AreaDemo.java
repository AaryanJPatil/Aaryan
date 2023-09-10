import java.util.Scanner;

public class AreaDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter radius for circle");
        float r =sc.nextFloat();
        final float pi=3.14f;
        float area =pi*r*r;
        System.out.println("area of circle\t"+area);
    }
    
}
