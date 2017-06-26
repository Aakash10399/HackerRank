// Failed 5 times with 4 test cases getting timed out.
// Ryan Fehr helped put things into perspective.
// Ryan Fehr's solution is still faster as he uses StringBuilder to save efficiency in I/O
// dont use else in newcomparer in the loop as it could be same numbers and for same number it would then return -1

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.BigInteger;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        Arrays.sort(unsorted, new Comparator<String>() {
            @Override
           public int compare(String a,String b)
           {
               return newcomparer(a,b);
           }
        });
        for(int i=0;i<n;i++)
            System.out.println(unsorted[i]);
           
    }
    public static int newcomparer(String a,String b)
    {
        if(a.length()>b.length())
            return 1;
        if(a.length()<b.length())
            return -1;
        for(int i=0;i<a.length();i++)
        {
            if((int)a.charAt(i)>(int)b.charAt(i))
                return 1;
            if((int)a.charAt(i)<(int)b.charAt(i))
                return -1;
        }
        return 0;
    }
}
