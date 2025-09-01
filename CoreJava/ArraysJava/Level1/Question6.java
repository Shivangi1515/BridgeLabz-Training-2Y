import java.util.Arrays;
import java.util.Scanner;
public class Question6 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter size of the array");

        int size=sc.nextInt();

        int sum=0;

        int[]heights=new int[size];


        for(int i=0;i<heights.length;i++){
            heights[i]=sc.nextInt();
        }
        
        System.out.println(Arrays.toString(heights));
        
        for(int i=0;i<heights.length;i++){
            sum+=heights[i];

        }
        int mean=sum/heights.length;
        System.out.println("Mean height of all the players"+mean);
        sc.close();


    }
    
}
