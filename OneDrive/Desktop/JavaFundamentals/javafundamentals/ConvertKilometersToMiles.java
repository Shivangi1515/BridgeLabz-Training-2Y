import java.util.*;
public class ConvertKilometersToMiles {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter distance inn km");

        double distance=sc.nextDouble();

        double miles=distance*0.621371;

        System.out.print("Conversion of kilometres to Miles"+miles);

        sc.close();


        
    }
    
}
