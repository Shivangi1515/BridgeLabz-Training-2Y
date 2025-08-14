import java.util.*;
public class PowerCalculation {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter base");
        double b=sc.nextInt();

        System.out.print("Enter exponent");
        double e=sc.nextInt();

        double calculate=Math.pow(b,e);

        System.out.print("Power Calculation:"+calculate);

        sc.close();

        
    }
    
}
