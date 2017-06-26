import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int c=0;
        for(int i=0;i<N;i++)
            {
            printer(N-1-i,' ');
            printer(i+1,'#');
            System.out.println();
        }
        
    } 
    public static void printer(int n,char ch){
        {
         for(int i=0;i<n;i++){
            System.out.print(ch);}
        }
    }
}