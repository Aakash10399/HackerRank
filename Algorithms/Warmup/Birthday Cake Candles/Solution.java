import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();int count=0;int max=0;
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(max<height[height_i])
                max=height[height_i];
        }
        for(int i=0;i<n;i++)
            {
            if(height[i]==max)
                {
                count++;
            }
        }
        System.out.println(count);
    }
}
