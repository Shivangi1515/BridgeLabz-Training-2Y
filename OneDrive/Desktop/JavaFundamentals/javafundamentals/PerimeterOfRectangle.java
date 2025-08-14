import java.util.*;
public class PerimeterOfRectangle {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter length of rectangle");
        int l=sc.nextInt();

        System.out.print("Enter breadth of rectangle");
        int b=sc.nextInt();

        int perimeter=2*(l+b);

        System.out.print("Perimeter of Rectangle:"+perimeter);

        sc.close();


        
    }
    
}
