import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        // Complete this function
        int ret[] = new int[grades.length];
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]<38)
            {
                ret[i]=grades[i];
            }
            else if((grades[i]+1)%5==0)
            {
                ret[i]=grades[i]+1;
            }
            else if((grades[i]+2)%5==0)
            {
                ret[i]=grades[i]+2;
            }
            else
            {
                ret[i]=grades[i];
            }
        }
        return ret;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int result[] = solve(grades);
        for(int i=0;i<result.length;i++)
            System.out.println(result[i]);
    }
}
