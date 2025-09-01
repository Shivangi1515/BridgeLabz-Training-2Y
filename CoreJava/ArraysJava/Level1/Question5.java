import java.util.Arrays;
import java.util.Scanner;
public class Question5 {


      public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number");

        int n=sc.nextInt();
        
        int[]result=new int[4];

        for(int i=6;i<=9;i++){
            result[i-6]=n*i;
        }
        System.out.println(Arrays.toString(result));

        for(int i=6;i<=9;i++){
            System.out.println(n+"*"+i+"="+result[i-6]);
        }

        sc.close();

        
    }
    
}
