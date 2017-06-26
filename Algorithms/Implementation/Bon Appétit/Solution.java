import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        double c[] = new double[n];
        for(int i=0;i<n;i++)
            c[i]=in.nextDouble();
        double b_chrged = in.nextDouble();
        double b_actual = 0.0;
        for(int i=0;i<n;i++)
            {
            if(i!=k)
                b_actual = b_actual + c[i]/2.0;
        }
        if(b_actual==b_chrged)
            System.out.println("Bon Appetit");
        else
          System.out.println(Math.abs((int)(b_actual-b_chrged)));
    }
}