/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[] cache = new long[n+1];
		Arrays.fill(cache,-1);
		System.out.println(count(n,0,cache));
    }
	static long count(long n, int csum, long cache[]){

		if(csum>n)
		return 0;

		if(csum==n)
		return 1;

		if(cache[csum]!=-1)
		return cache[csum];

		long one = count(n,csum+1,cache);
		long three = count(n,csum+3,cache);
		long four = count(n,csum+4,cache);

		return cache[csum] = one+three+four;
	}
}