import java.util.*;
public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius");

        double Celsius=sc.nextDouble();

        double fahrenheit=(Celsius*(9/5))+32;

        System.out.print("Temperature in Fahrenheit is:"+fahrenheit);
        sc.close();

        
    }
    
}
