/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main { 
    public static int check(int[] arr, int curr,int k,int tsum)
    {     
         
        if(curr==arr.length)
        {
            if(k==tsum)
            {
            return 1;
            } 
         return 0;  
        }  
     
       int  c= check(arr,curr+1,k,tsum+arr[curr]); 
       int   d= check(arr, curr+1,k,tsum-arr[curr]); 
        return   c+d;
    }
    public static void main (String args[]) { 
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt(); 
        int k= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }  
       System.out.println(check(arr,0,k,0));
      

    }
}