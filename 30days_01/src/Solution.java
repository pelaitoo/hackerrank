import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int var1 = 0;
        double var2 = 0;
        String var3 = "hhhh";
        /* Read and save an integer, double, and String to your variables.*/
        var1 = scan.nextInt();
        var2 = scan.nextDouble();
        double r = d+var2;

        while(scan.hasNextLine()){
            //var3 = scan.nextLine();
            scan.nextLine();
            System.out.println(i+var1 + "\n" + r + "\n" + s+scan.nextLine());
        }

        scan.close();
    }
}
