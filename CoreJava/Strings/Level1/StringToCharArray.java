package CoreJava.Strings.Level1;
import java.util.Arrays;
import java.util.Scanner;

public class StringToCharArray {

    public static char[] getChar(String str){
        char[] chars=new char[str.length()];

        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
        return chars;
    }

    public static boolean compareArrays(char[]arr1,char[]arr2){
        if(arr1.length!=arr2.length){
            return false;

        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String");

        String input=sc.next();

        char[]userDefinedChars=getChar(input);

        char[]builtInChars=input.toCharArray();

        boolean Equal=compareArrays(userDefinedChars,builtInChars);

        System.out.println("With userdefined Method "+Arrays.toString(userDefinedChars));
        System.out.println("With userdefined Method "+Arrays.toString(builtInChars));

        System.out.println("are both arrays equal "+Equal);

        sc.close();
        
    }
    
}
