/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main { 
	public static  int check (int n)
	{
		if(n==0)
		{
			return 1;
		} 
		if(n<0)
		{
			return 0;
		} 
		int c= check(n-1);
		int d= check(n-2);
		return c+d;
	}
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
	System.out.println(check(n));

    }
}