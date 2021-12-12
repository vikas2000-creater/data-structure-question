/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{  
    public static  int check(int[] prices,int buy,int k,int curr,int[][][] dp){ 
        if(k==0)
        {
            return 0;
        } 
        if(curr==prices.length)
        {
            return 0;
        } 
        int c=0;
        int d=0;
        int e=0;
        int f=0; 
        if(dp[curr][buy][k]!=-1)
        {
            return dp[curr][buy][k];
        }
          if(buy==1)
         {
           c= check(prices,0,k,curr+1,dp)-prices[curr];
            d= check(prices,buy,k,curr+1,dp); 
                return dp[curr][buy][k]= Math.max(c,d);
          } 
    else{
        e= check(prices,1,k-1,curr+1,dp)+prices[curr];
        f= check(prices,0,k,curr+1,dp);
               return dp[curr][buy][k]=Math.max(e,f);
    } 
    }
	public static void main(String[] args) { 
	    int[] prices={1,2,3,4,5};
	int[][][] dp= new int[prices.length+1][2][3];
        for(int[][] row:dp)
        {
            for(int[]dpss: row)
            {
                Arrays.fill(dpss,-1);
            }
        }
        System.out.println(check(prices,1,2,0,dp));
        
	}
}
