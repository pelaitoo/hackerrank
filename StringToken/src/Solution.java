import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        String[] tokenss = s.split("[ !,?._'@]");
        String[] tokens2 = new String[tokenss.length];

        int k = 0;
        for(int j = 0;j<tokenss.length;j++){
            if(tokenss[j].compareTo("") != 0){
                tokens2[k] = tokenss[j];
                k++;
            }
        }

        System.out.println(k);
        for(int i=0;i<k;i++){
            System.out.println(tokens2[i]);
        }
        scan.close();
    }
}
