import jdk.nashorn.internal.objects.NativeUint8Array;

import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        Locale indiaLocale = new Locale("en","IN");

        NumberFormat nfFR = NumberFormat.getCurrencyInstance(Locale.FRENCH);
        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        NumberFormat nfHI = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat nfCH = NumberFormat.getCurrencyInstance(Locale.CHINA);

        String us = nfUS.format(payment);
        String india = nfHI.format(payment);
        String china = nfCH.format(payment);
        String france = nfFR.format(payment);

        //myString = NumberFormat.getInstance(Locale.HINDI).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }

}
