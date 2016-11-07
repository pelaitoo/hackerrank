import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int maxValue = -64;
        int actualValue = 0;

        int imax = 0;
        int jmax = 0;

        for(int j=0;j<4;j++) {
            for (int i = 0; i < 4; i++) {
                actualValue = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i + 1][j + 1] + arr[i+2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                /*System.out.print(arr[i][j]);
                System.out.print(arr[i + 1][j]);
                System.out.println(arr[i + 2][j] );
                System.out.println( arr[i + 1][j + 1]);
                System.out.print(arr[i][j + 2]);
                System.out.print(arr[i + 1][j + 2]);
                System.out.println(arr[i + 2][j + 2]);
                System.out.println(i + " " + j);*/
                if (actualValue > maxValue) {
                    maxValue = actualValue;
                    imax = i;
                    jmax = j;
                }
            }
        }
        System.out.println(maxValue);
        System.out.println(imax + " " + jmax);


    }
}