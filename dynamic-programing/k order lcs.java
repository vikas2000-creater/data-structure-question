/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main { 
	public static int check(int[] arr,int[] arr1, int i ,int j,int k,int[][][] dp)
	{
          if(i==arr.length || j== arr1.length)
		  {
			  return 0;
		  }  
		  int a=0; 
		  int d=0; 
		  int e=0;
		  int f=0; 
		  if(dp[i][j][k]!=-1)
		  {
			  return dp[i][j][k];
		  }
		  if(arr[i]==arr1[j])
		  { 
              a= 1+check(arr,arr1,i+1 ,j+1, k,dp);
		  } 
		  else
		  {
			  if(k>0) 
			  {
                  d= 1+check(arr,arr1,i+1 ,j+1, k-1,dp);
			  } 
			  else{
			 
				  e=check(arr,arr1,i+1 ,j, k,dp); 
				  f=check(arr,arr1,i,j+1, k,dp); 
			  } 
          
		  } 
		   return dp[i][j][k]=Math.max(e,f)+d+a;
	}
    public static void main(String args[]) {  
		Scanner sc= new Scanner(System.in); 
		int n= sc.nextInt();
		int k= sc.nextInt();
		int l= sc.nextInt(); 

		int[] arr= new int[n];
		int [] arr1= new int[k]; 
		int[][][] dp= new int[n+1][k+1][l+1];
		for(int i=0;i<=n;i++){
			for(int h=0;h<=k;h++){
			for(int ll=0;ll<=l;ll++){ 
				dp[i][h][ll]=-1;
			
		}
		}
		}
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++)
		{
			arr1[i]=sc.nextInt();
		} 
		System.out.println(check(arr,arr1,0,0,l,dp));

    }
}
