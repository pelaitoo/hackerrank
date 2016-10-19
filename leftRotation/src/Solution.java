import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        String firstLine = scan.nextLine();
        String secondLine = scan.nextLine();
        scan.close();

        String[] params = firstLine.split(" ");
        if (params.length != 2){
            System.out.println("Error de parametros");
        }
        Integer arrayLength = Integer.parseInt(params[0]);
        Integer arrayLefts = Integer.parseInt(params[1]);

        String[] numbers = secondLine.split(" ");
        if(numbers.length != arrayLength){
            System.out.println("Error de array");
        }
        if(arrayLefts == 0 ){
            System.out.println(secondLine);
            return;
        }
        Integer modulo = arrayLefts % arrayLength ;
        System.out.println(modulo);
        if(modulo == 0){
            System.out.println(secondLine);
        }else{
            String[] result = new String[arrayLength];
            Integer j = 0;
            for(Integer i = modulo; i < arrayLength;i++){
                result[j] = numbers[i];
                j++;
            }

            for(Integer i = 0; i < modulo;i++){
                result[j] = numbers[i];
                j++;
            }
            for(Integer i = 0; i < result.length;i++){
                System.out.print(result[i]);
                if(i < result.length-1 ){
                    System.out.print(" ");
                }


            }
        }
    }
}