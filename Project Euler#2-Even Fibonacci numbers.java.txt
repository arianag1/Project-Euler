import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static long FibIterative(long n){
        long term1 = 0, term2 = 1, value = 0, sum = 0;
        while(value < n){
            if((value % 2) == 0){
                sum+= value;
            }
            term1 = term2;
            term2 = value;
            value = term1 + term2;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(FibIterative(n));
        }
    }
}
