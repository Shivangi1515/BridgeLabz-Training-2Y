import java.util.*;
public class VolumeOfACylinder {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter radius of Cylinder");
        double r=sc.nextDouble();
        
        System.out.print("Enter height of Cylinder");
        double h=sc.nextInt();

        double Volume=3.14*r*r*h;

        System.out.print("Volume of Cylinder is:"+Volume);

        sc.close();
    }
}
