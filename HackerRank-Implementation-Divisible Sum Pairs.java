import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int sum = 0, count = 0;
        for(int i = 0; i < ar.length; i++){
           for(int j = ar.length-1; j >= 1; j--){
                sum = ar[i]+ar[j];
                 if((i < j) && (sum%k) == 0 ){
                   count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
