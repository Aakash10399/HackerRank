import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int count = 0;
        Arrays.sort(b);
        for(int i=1;i<=b[b.length-1];i++)
            {
            if(checkb(i,b)==true)
                {
                if(checka(i,a)==true)
                    count++;
            }
        }
        System.out.println(count);
    }
    public static boolean checkb(int z,int arr[])
        {
        boolean ret = true;
        for(int i=0;i<arr.length;i++)
            {
            if(arr[i]%z!=0)
                {ret=false;break;}
        }
         return ret;
    }
    public static boolean checka(int z,int arr[])
        {
        boolean ret = true;
        for(int i=0;i<arr.length;i++)
            {
            if(z%arr[i]!=0)
                {ret=false;break;}
        }
        return ret;
    }
}
