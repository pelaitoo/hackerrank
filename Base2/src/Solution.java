import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String output = Integer.toBinaryString(n);

        char[] array = output.toCharArray();
        int max = 0;
        int actual = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] == '1'){
                actual = actual+1;
                if(actual>max){
                   max = actual;
                }
            }else{
                actual=0;
            }
        }

        System.out.println(max);


    }
}
