/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main { 
	public static int helper(int k , String s)
	{    
		if(k<s.length())
		{
			return 0;
		} 
		if(k==s.length())
		{
			return 1;
		}
		int c= helper(k , s+'0');  
		int l=0;
		if(s.length()==0 || s.charAt((s.length()-1))!='1')
		{ 
          l= helper(k,s+'1');
		} 
		return c+l;
	}

    public static void main(String args[]) { 
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		while(n-->0)
		{  
			int k= sc.nextInt(); 
		
			System.out.println(helper(k,"")); 

		}

    }
}