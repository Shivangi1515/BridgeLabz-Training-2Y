package CoreJava.Strings.Level1;
import java.util.Scanner;

public class CountVowelsandConsonents {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();

        int vowels_count=0;
        int consonent_count=0;

        for(int i=0;i<str.length()-1;i++){

            char ch=str.charAt(i);

            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels_count++;
                }
                else{
                    consonent_count++;
                }
            }


        }
        System.out.println("Number of Vowels in a string "+vowels_count);
        System.out.println("Number of Vowels in a string "+consonent_count);

        sc.close();


        
        
    }
    
}
