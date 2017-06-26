import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String args[]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String out="";
        int hours = Integer.parseInt(input.substring(0,2));
        int minutes = Integer.parseInt(input.substring(3,5));
        int seconds = Integer.parseInt(input.substring(6,8));
        String h=Integer.toString(hours),m=Integer.toString(minutes),s=Integer.toString(seconds);
        String zone = input.substring(8);
        if(zone.equalsIgnoreCase("AM"))
        {
            out = input.substring(0,8);
            if(hours==12)
            {
                out="00"+out.substring(2);
            }
        }
        else
            {
            hours+=12;
            if(hours>=24)
               hours-=12;
            h=Integer.toString(hours);
            if(checkl(hours)==false)
               h="0"+h;
            if(checkl(minutes)==false)
               m="0"+m;
            if(checkl(seconds)==false)
               s="0"+s;
            out = h+":"+m+":"+s;
        }
        System.out.print(out);
    }
    public static boolean checkl(int n)
    {
        if(n>9)
            return true;
        else
            return false;
    }
}
