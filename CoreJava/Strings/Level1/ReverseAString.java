package CoreJava.Strings.Level1;
import java.util.Scanner;
public class ReverseAString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String");

        String str=sc.next();

        String newstr="";

        for(int i=str.length()-1;i>=0;i--){

            newstr+=str.charAt(i);

        }
        System.out.println("Reversed String is "+newstr);

        sc.close();
    }
    
}
