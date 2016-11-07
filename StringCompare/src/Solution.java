import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int length = in.nextInt();
        int Slength = S.length();

        String firstWord = "z";
        String lastWord = "A";

        for(int i = 0; i<Slength-1;i++){
            if(i+length <= Slength){
                //System.out.println(S.substring(i,i+length));
                if(S.substring(i,i+length).compareTo(firstWord) < 0){
                    firstWord = S.substring(i,i+length);
                }
                if(S.substring(i,i+length).compareTo(lastWord) > 0){
                    lastWord = S.substring(i,i+length);
                }
            }
        }
        System.out.println(firstWord);
        System.out.println(lastWord);

    }
}
