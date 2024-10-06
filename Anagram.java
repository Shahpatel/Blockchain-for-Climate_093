import java.util.Arrays;
import java.util.Scanner;

public class Anagram {


    //creating method for checking string are anagrams or not
    public static boolean anagram(String str1,String str2){
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();


        //if the length of str1 and str2 is not same then they can not be anagrams

        if(str1.length()!=str2.length()){
            return  false;
        }
        //converting string to char and sorting them
        char[] charArr1=str1.toCharArray();
        char [] charArr2=str2.toCharArray();

        Arrays.sort(charArr1); //sorting
        Arrays.sort(charArr2);

        return Arrays.equals(charArr1,charArr2);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // Input two strings
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        if(anagram(str1,str2)){
            System.out.println(str1 + "\" and \"" + str2 + "\" are anagrams.");
        }
        else{
            System.out.println("they not are anagrams");
        }
    }
}
