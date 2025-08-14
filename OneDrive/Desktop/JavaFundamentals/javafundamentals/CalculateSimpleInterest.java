import java.util.*;
public class CalculateSimpleInterest {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter principal");
        double p=sc.nextDouble();

        System.out.print("Enter Rate");
        double r=sc.nextDouble();

        System.out.print("Enter time");
        double t=sc.nextDouble();

        double si=(p*r*t)/100;

        System.out.print("Simple Interest is:"+si);

        sc.close();
        
    }
    
}
