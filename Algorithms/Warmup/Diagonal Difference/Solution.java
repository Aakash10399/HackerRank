import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();int sum=0;
        int arr[][] = new int[N][N];
        for(int i=0;i<N;i++)
            {
            for(int j=0;j<N;j++)
                {
                arr[i][j]=in.nextInt();
                if(arr[i][j]>=-100 && arr[i][j]<=100){
                if(i==j)
                    {sum-=arr[i][j];}
                if((i+j)==N-1)
                    {sum+=arr[i][j];}
            }
                }
        }
        System.out.println(Math.abs(sum));
        
    }
}