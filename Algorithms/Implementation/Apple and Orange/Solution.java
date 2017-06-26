import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int count_a=0,count_o=0;
        for(int i=0;i<m;i++)
            {
            if(check(s,t,a+apple[i]))
                {count_a++;}
        }
        for(int i=0;i<n;i++)
            {
            if(check(s,t,b+orange[i]))
                {count_o++;}
        }
        System.out.println(count_a);
        System.out.println(count_o);
        
    }
    public static boolean check(int r1,int r2,int arg)
        {
        if(arg>=r1 && arg<=r2)
            {return true;}
        else
            {return false;}
    }
}
