import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
  
public class Solution {
   
    static int reverse(int n){
        int reverse = 0;
        int remainder = 0;
        while(n > 0){
            remainder = n % 10;
            reverse = reverse *10 + remainder;
            n/=10;
        }
        return reverse;
    }
    static int findPalid(int n){
        int product = 0, revPali = 0, max = 0;
        int LIMIT = 1000, START = 100;
        for(int i = START; i < LIMIT; i++){
            for(int j = LIMIT-1; j >= START; j--){
                product = i*j;
                revPali = reverse(product);
                if(product < n && (revPali == product)){
                    if(max < product){
                        max = product;
                    }
                }
            }
        }
        return max;
           
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a = 0; a < t; a++){
            int n = in.nextInt();
            System.out.println(findPalid(n));
        }
    }
}
