import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of Circle");

        double r=sc.nextInt();

        double area=3.14*r*r;

        System.out.print("Area Of circle is:"+area);

        sc.close();
        }
}