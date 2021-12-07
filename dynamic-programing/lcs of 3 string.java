/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main { 
	public static int helper(String s1, String s2, String s3 ,int i ,int j ,int l,int[][][] dp)
	{     
		if(s1.length()==i || s2.length()==j || s3.length()==l)
		{
			return 0;
		} 

		int k=0;
		int c=0;
		int d=0; 
		int e=0;
           if(dp[i][j][k]!=-1){
			   return dp[i][j][k];
		   }
		if(s1.charAt(i)==s2.charAt(j) && s2.charAt(j)==s3.charAt(l))
		{
			 k= 1+helper(s1, s2,s3 , i+1 , j+1 , l+1,dp); 
		}  
		else{
		 c= helper(s1, s2,s3 , i+1 , j , l,dp); 
		 d= helper(s1, s2,s3 , i , j+1 , l,dp); 
		 e= helper(s1, s2,s3 , i , j , l+1,dp); 
		}
		  return  dp[i][j][l]=Math.max(c,Math.max(d,e))+k; 
	}
    public static void main(String args[]) { 
		Scanner sc= new Scanner(System.in);
	String k= sc.nextLine();
		String l= sc.nextLine();
		String m= sc.nextLine(); 
		int[][][] dp= new int[k.length()+50][l.length()+50][m.length()+50];
		for (int i = 0; i < k.length()+50; i++)
        {
            for (int j = 0; j <l.length()+50; j++)
            {
                for (int kk = 0; kk <m.length()+50; kk++)
                {
                    dp[i][j][kk] = -1;
                }
            }
        }
		System.out.println(helper(k,l,m, 0,0,0,dp));
		

    }
}