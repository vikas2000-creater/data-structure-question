/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main { 
	public  static int check(int[] num,int i,int prev,int[][]cach)
    { 
        int c=0;
        if(i==num.length)
        {
            return 0;
        }   
        if(cach[i][prev+1]!=10001)
        {
            return cach[i][prev+1];
        }
        if( prev==-1 ||num[i]>num[prev])
        {
           c= check(num,i+1,i,cach) +1;
        } 
            int   d=check(num,i+1,prev,cach);
         
        return cach[i][prev+1]= Math.max(c,d);
    }
    public static void main(String args[]) {  
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();

		}   
		int[][] cach= new int[arr.length][arr.length]; 
        for(int [] row:cach)
        Arrays.fill(row,10001);
       System.out.println(check(arr,0,-1,cach));


    }
}