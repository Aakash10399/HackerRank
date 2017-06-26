import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int year_nolp[] = {0,31,28,31,30,31,30,31,30,30,31,30,31};
    static int year_leap[] = {0,31,29,31,30,31,30,31,30,30,31,30,31};
    static int year_1918[] = {0,31,15,31,30,31,30,31,30,30,31,30,31};
    static String solve(int year){
        // Complete this function
        int day=0,mon=1,sum=0;
        boolean flag=false;
        if(year>=1700 && year<=1917)
            {
            for(int i=1;i<=12;i++)
                {
                if(year%4==0)
                    {sum=sum+year_leap[i];flag=true;}
                if(year%4!=0)
                    {sum=sum+year_nolp[i];}
                if(sum>256)
                    {
                    if(flag)
                        {day=year_leap[i]-(monsum(i,year_leap)-256)-1;}
                    else
                        {day=year_nolp[i]-(monsum(i,year_nolp)-256)-1;}    
                    mon=i;
                    break;
                }
            }
        }
        else if(year==1918)
            {
            for(int i=1;i<=12;i++)
                {
                sum=sum+year_1918[i];
                if(sum>256)
                    {
                    {day=year_1918[i]-(monsum(i,year_1918)-256)-1;
                    mon=i;
                    break;
                }
            }
        }
        }
        else if(year>=1919 && year<=2700)
            {
            for(int i=1;i<=12;i++)
                {
                if(year%400==0 ||(year%4==0 && year%100!=0))
                    {sum=sum+year_leap[i];flag=true;}
                else
                    {sum=sum+year_nolp[i];}
                if(sum>256)
                    {
                    if(flag)
                        {day=year_leap[i]-(monsum(i,year_leap)-256)-1;}
                    else
                        {day=year_nolp[i]-(monsum(i,year_nolp)-256)-1;} 
                    mon=i;
                    break;
                }
            }
        }
        String ret=day+"."+mon+"."+year;
        if(day<10)
            {ret="0"+day+"."+mon+"."+year;}
        if(mon<10)
            {ret=day+"."+"0"+mon+"."+year;}
        if(day<10 && mon<10)
            {ret="0"+day+"."+"0"+mon+"."+year;}
        return ret;        
    }
    public static int monsum(int m,int arr[])
        {int ret=0;
        for(int i=1;i<=m;i++)
            {ret=ret+arr[i];}
         return ret;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
