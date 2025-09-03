import java.util.Arrays;
import java.util.Scanner;
public class OddEvenArray {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number");
        int n=sc.nextInt();

        if(n<=0){
            System.out.println("Not a Natural Number");
            return;
        }
        int[]odd=new int[n/2+1];
        int[]even=new int[n/2+1];

        int odd_index=0;
        int even_index=0;

        for(int i=1;i<=n;i++){

            if(i%2==0){
                even[even_index++]=i;
                
            }
            else{
                odd[odd_index++]=i;
                
            }

        }
        //To remove the 0 at the end 
        int[] oddFinal = Arrays.copyOf(odd, odd_index);
        int[] evenFinal = Arrays.copyOf(even, even_index);

        System.out.println("Odd Numbers: " + Arrays.toString(oddFinal));
        System.out.println("Even Numbers: " + Arrays.toString(evenFinal));
        sc.close();


        
    }
}
