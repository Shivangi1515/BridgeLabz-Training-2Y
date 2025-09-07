package CoreJava.Strings.Level1;
import java.util.Scanner;

public class CreateASubstring {

    public static String createSubString(String str,int si,int ei){

        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
           

        }
        return substr;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a String");

        String s=sc.next();

        System.out.println("By Custom Method "+createSubString(s,0,5) );

        //By Builtin Method

        System.out.println("By BuiltIn Method "+s.substring(0,5));

        sc.close();




    }
    
}
