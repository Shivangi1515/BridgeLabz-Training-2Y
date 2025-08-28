import java.util.*;
public class Question2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array");
        int size=sc.nextInt();

        int[]numbers=new int[size];
        System.out.println("Enter five numbers");

        for(int i=0;i<numbers.length;i++){
            System.out.println("Number "+(i+1));
            numbers[i]=sc.nextInt();
        }

        for(int i=0;i<numbers.length;i++){
            int num=numbers[i];

            if(num>0){
                if(num%2==0){
                    System.out.println("Number is Positive and even");
                }
                else{
                    System.out.println("Number is positive and odd");
                }
            }
            else if(num<0){
                System.out.println("Number is Negative");
            }
            else{
                System.out.println("Number is zero");
            }
        }
        int num1=numbers[0];
        int num2=numbers[numbers.length-1];

        if(num1>num2){
            System.out.println(num1+"is greater than"+num2);

        }
        else if(num1<num2){
            System.out.println(num2+"is greater than"+num1);
        }
        else{
            System.out.println("Both numbers are equal");
        }
        sc.close();

        
    }
    
}
