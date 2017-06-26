import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        // your code goes here
        int max=0;int num=1;
        for(int i=1;i<=5;i++)
            {
            if(freq(i,types)>max)
                {
                max=freq(i,types);
                num=i;
            }
        }
        System.out.println(num);
    }
    public static int freq(int n,int[] arr)
        {
        int ret=0;
        for(int i=0;i<arr.length;i++)
            {
            if(arr[i]==n)
                ret++;
        }
        return ret;
    }
}
