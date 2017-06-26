import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int arr[] = new int[in.nextInt()];
        double c1=0.0;double c2=0.0;
        for(int i=0;i<arr.length;i++)
            {
            arr[i]=in.nextInt();
            if(arr[i]>0)
                c1++;
            if(arr[i]<0)
                c2++;
        }
        System.out.println((c1/arr.length));
        System.out.println((c2/arr.length));
        System.out.println(1.0-((c1/arr.length)+(c2/arr.length)));
        
    }
}