import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       double PI=3.14;

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the radius of the circle");
       double r = sc.nextDouble();

       System.out.println("Area of the circle: "+PI*r*r);
    }
}
