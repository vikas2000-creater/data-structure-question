/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{   
        public  static int check(int[] arr,int buy ,int curr,int[][] dp)
    {    
        if(curr==arr.length)
        {
            return 0;
        }
        int c=0;
        int d=0;
        int e=0;
        int f=0;   
        if(dp[curr][buy]!=-1)
        {
            return dp[curr][buy];
        }
        if(buy==1)
        {
            c= check(arr, 0, curr+1,dp)- arr[curr];
            d= check(arr, buy, curr+1,dp); 
            return dp[curr][buy]= Math.max(c,d);
        }  
        else
        {
            e= check(arr,1, curr+1,dp)+arr[curr];
            f= check(arr,0, curr+1,dp);
            return dp[curr][buy]=Math.max(e,f);
        }
        
    }
	public static void main(String[] args) { 
	    int[] prices={1,2,3,4,5};
	    int[][] dp= new int[prices.length+1][2];
        for(int[] row: dp)
        {
            Arrays.fill(row,-1);
        }
         System.out.println(check(prices,1,0,dp));
	
	}
}
