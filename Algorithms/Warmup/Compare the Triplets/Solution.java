import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int arr[] = {a0,a1,a2,b0,b1,b2};
        int arr2[] = new int[2];
        for(int i=0;i<3;i++)
            {
               if(arr[i]>=1 && arr[i]<=100 && arr[i+3]>=1 && arr[i+3]<=100){
                    if(arr[i]>arr[i+3])
                        arr2[0]++;
                    if(arr[i]<arr[i+3])
                        arr2[1]++;
                }
            }
        return arr2;
            
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        String separator = "", delimiter = " ";
        for (Integer value : result) {
            System.out.print(separator + value);
            separator = delimiter;   
        }
        System.out.println("");
        

    }
}
