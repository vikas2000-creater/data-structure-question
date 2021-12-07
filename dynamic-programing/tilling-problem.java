/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main { 
	public static  int check(int n,int[] cach)
	{
		if(n==0)
		{
			return 1;
		}
		 if(n<0)
		 {
			 return 0;
		 }  
		 if(cach[n]!=-1)
		 {
			 return cach[n];
		 }
		 return cach[n]=check(n-1,cach)+ check(n-2,cach);
	}
    public static void main (String args[]) {
		Scanner sc= new Scanner(System.in); 
		
		int n= sc.nextInt();
		int []cach= new int[n+1]; 
		Arrays.fill(cach,-1);
		 System.out.println(check(n,cach));
		

    }
}