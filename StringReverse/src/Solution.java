import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int largo = A.length();
        int i=0;
        int j=A.length()-1;
        boolean is = true;
        String answer = "Yes";
        while(i<j && i!=j){
            char a =A.charAt(i);
            char b =A.charAt(j);
            if(a != b){
                is = false;
                answer = "No";
                break;
            }
            i++;
            j--;
        }
        System.out.println(answer);

    }
}
