import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        String s1="";
        boolean flag = false;
        while(flag==false)
        {
            s=one_operation(s);
            if(s1.equalsIgnoreCase(s))
            {flag=true;}
            else
            {s1=s;}
        }
        if(s.equalsIgnoreCase(""))
        {s="Empty String";}
        return s;
    }
    static String one_operation(String s)
    {
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                s=s.substring(0,i)+s.substring(i+2);
                break;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
