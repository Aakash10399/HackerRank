import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean flag=false;
        while(x1<=(Math.pow(10,31)) && x2<=(Math.pow(10,31)) && x1>=0 && x2>=0)
            {
            x1 = x1 + v1;
            x2 = x2 + v2;
            if(x1==x2)
                {
                flag=true;break;
                }     
        }
        if(flag==true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
