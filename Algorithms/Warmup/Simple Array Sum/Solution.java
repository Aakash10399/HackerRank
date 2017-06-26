import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();int sum = 0;
        for(int i=1;i<=N;i++)
            {
            sum = sum + in.nextInt();
        }
        System.out.println(sum);
    }
}