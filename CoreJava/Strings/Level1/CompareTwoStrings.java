package CoreJava.Strings.Level1;
import java.util.*;
public class CompareTwoStrings {

    public static boolean compareStrings(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        //compare each character now
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first string");
        String s1=sc.next();

        System.out.print("Enter second string");
        String s2=sc.next();

        boolean compareAns=compareStrings(s1,s2);

        boolean BuiltInAns=s1.equals(s2);

        System.out.println("By comparsion result:"+compareAns);
        System.out.println("By BuiltIn Method"+BuiltInAns);


       //Check both the answers

       if(compareAns==BuiltInAns){
        System.out.println("Both Result are same");

       }
       else{
        System.out.println("Not same");
       }
       sc.close();
        
    }


    
}
