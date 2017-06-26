import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long arr[] = {a,b,c,d,e};
        long sum=a+b+c+d+e;
        long max=a+b+c+d,min=a+b+c+d;
        for(int i=0;i<5;i++)
            {
            if(max<(sum-arr[i]))
                max=sum-arr[i];
            if(min>(sum-arr[i]))
                min=sum-arr[i];
        }
        System.out.print(min+" "+max);
    }
}
