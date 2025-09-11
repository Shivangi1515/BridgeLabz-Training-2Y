package CoreJava.Strings.Level1;
import java.util.Scanner;
public class PalindromeCheck {

    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);

            if(start!=end){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String");
        String str=sc.next();

        System.out.println("Whether Palindrome or not "+isPalindrome(str));

        sc.close();


    }
    
}
