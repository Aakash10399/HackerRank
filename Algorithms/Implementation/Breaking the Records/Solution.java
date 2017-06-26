import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        int max_c=0,max=0,min_c=0,min=0;int i,j;
        for(i=1;i<s.length;i++)
            {
            max_c=0;min_c=0;
            for(j=0;j<i;j++)
                {
                if(s[i]>s[j])
                    max_c++;
                if(s[i]<s[j])
                    min_c++;
            }
            if(max_c==j)
                max++;
            if(min_c==j)
                min++;
        }
        int ret[] = {max,min};
        return ret;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
