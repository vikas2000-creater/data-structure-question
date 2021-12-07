/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main { 
    public static int check(int[][] arr,int n,int m, int i, int j)
    {     
        if(i<0 || j<0 || i>=n || j>=m)
        {
            return Integer.MAX_VALUE;
        }
        if(i==n-1 && j==m-1)
        {
            return arr[i][j];
        }   
          int e=  check( arr, n, m, i,j+1);
           int f=  check( arr, n, m,i+1,j);  
        return Math.min(e,f)+arr[i][j];

    }
    public static void main (String args[]) { 
        int n;
        int m;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        m= sc.nextInt();
        int arr[][]= new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]= sc.nextInt();
        
            }
        } 
       System.out.println(check(arr,n,m,0,0));


    }
}