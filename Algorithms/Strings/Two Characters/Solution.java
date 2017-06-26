import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        String temp=strip_multiple(s);
        String temp2="";
        int max = 0;
        for(int i=0;i<temp.length();i++)
        {
            for(int j=0;j<temp.length();j++)
            {
                if(temp.charAt(i)!=temp.charAt(j))
                {
                    temp2 = strip_letters(s,temp.charAt(i),temp.charAt(j));
                    if(check_succession(temp2))
                    {
                        if(temp2.length()>max)
                        {max=temp2.length();}
                    }
                }
            }
        }
        System.out.println(max);
    }
    public static String strip_letters(String s,char c1,char c2)
    {
        String ret="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c1 || s.charAt(i)==c2)
            {
                ret = ret + s.charAt(i);
            }
        }
        return ret;
    }
    public static boolean check_succession(String s)
    {
        boolean ret = true;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                ret=false;break;
            }
        }
        return ret;
    }
    public static String strip_multiple(String s)
    {
        boolean flag=true;
        String ret="";
        for(int i=0;i<s.length();i++)
        {
            flag=true;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(j)==s.charAt(i))
                {
                    flag=false;break;
                }
            }
            if(flag)
            {
                ret=ret+s.charAt(i);
            }
        }
        return ret;
    }
}
