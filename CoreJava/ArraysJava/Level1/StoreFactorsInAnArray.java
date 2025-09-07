import java.util.Arrays;
import java.util.Scanner;
public class StoreFactorsInAnArray {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");


        int n=sc.nextInt();

        int count=0;

        for(int i=0;i<=n;i++){
            if(n%i==0){

                count++;
            }
        }
        int[]divisors=new int[count];

        int index=0;

        for(int i=0;i<=n;i++){
            divisors[index++]=i;
        }

        System.out.println(Arrays.toString(divisors));

        sc.close();
        
    }
    
}
