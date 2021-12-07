/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main { 
    public static int check(int[] arr, int curr,int[] dp)
    {    
        if(curr>=arr.length)
        {
          return 0;
        }  
        if(dp[curr]!=-1)
        {
            return dp[curr];
        }
       int c= check(arr,curr+1,dp)+arr[curr];
         int d= check(arr,curr+2,dp)+arr[curr]; 
         return dp[curr]=Math.min(c,d);
    }
    public static void main (String args[]) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n]; 
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }  
        int[] dp= new int[n+1]; 
        Arrays.fill(dp,-1);
         System.out.println(Math.min(check(arr,0,dp),check(arr,1,dp)));


    }
}