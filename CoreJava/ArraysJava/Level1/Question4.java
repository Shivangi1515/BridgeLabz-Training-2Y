import java.util.Arrays;
import java.util.Scanner;
public class Question4 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double[]numbers=new double[10];

        double sum=0;

        int index=0;

        System.out.println("Enter 0 or negative number to end the loop");

        while(true){
            double num=sc.nextDouble();

            if(num<=0){
                break;
            }
            if(index==10){
                break;
            }
            numbers[index]=num;
            index++;
        }
        System.out.println(Arrays.toString(numbers));

        for(int i=0;i<numbers.length;i++){

            sum+=numbers[i];

        }
        System.out.println("Sum of the numbers present in the array"+sum);
        
    }
    
}
