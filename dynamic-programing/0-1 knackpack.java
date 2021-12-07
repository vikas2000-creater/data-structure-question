/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main { 
  public static int check(int [] size,int[] value,int n,int k,int curr,int[][] cach)
  {   
	  if(curr==n)
	  {
		  return 0;
	  }
	  if(k==0)
	  {
		 
		  return  0;
	} 
	int c=0; 
	if(cach[curr][k]!=-1)
	{
		return cach[curr][k];
	}
	
	if(size[curr]<=k)
	{ 
	  c= value[curr]+check(size, value,n,k-size[curr],curr+1,cach);
	}  

	int d=check(size,value,n,k,curr+1,cach);

	return cach[curr][k]=Math.max(c,d);
  }
    public static void main(String args[]) { 

        // Your Code Here
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int k= sc.nextInt(); 
		int[][] cach= new int[n+1][k+1];  
		for(int[] row : cach)
		{
           	Arrays.fill(row,-1);
		}
	
		int size[]= new int[n]; 
		int[] value= new int [n];
		for(int i=0;i<n;i++)
		{
			size[i]=sc.nextInt();
		} 
		for(int i=0;i<n;i++)
		{
			value[i]=sc.nextInt();
		}  
		System.out.println(check(size,value,n,k,0,cach));

    }
}

