import java.util.*;
public class Question1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array");

        int size=sc.nextInt();

        int[]ages=new int[size];

        System.out.println("Enter the ages of the students");

        for(int i=0;i<size;i++){
            System.out.print("Enter age of student"+(i+1)+":");
            ages[i]=sc.nextInt();

        }

        System.out.println("Check the Eligibilty if the student can vote or not");

        
        for(int i=0;i<ages.length;i++){
            if(ages[i]<0){
                System.out.println("Student"+(i+1)+"entered invalid age");
            }
            else if(ages[i]>=18){
                System.out.println("Student"+(i+1)+"can vote");
            }
            else{
                System.out.println("Student"+(i+1)+"cannote vote");
            }


        }
        sc.close();
        
        
    }
    
}
