/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main { 
	public static  int check(String t1, String t2,int i,int j,int[][] cach)
         
     {    
        int c=0;
         int d=0;
         int e =0; 
         if(cach[i][j]!=-1)
         {
             return cach[i][j];
         }
         if(i==t1.length() || j==t2.length())
         {
             return 0;
         } 

         if(t1.charAt(i)==t2.charAt(j))
         {
           c= check(t1,t2,i+1,j+1,cach)+1;
         } 
         else
         {
             d=check(t1,t2,i+1,j,cach);
            e= check(t1,t2,i,j+1,cach);
         } 
          return cach[i][j]=  Math.max(d,e)+c;         
     }
    public static void main(String args[]) { 
        // Your Code Here 
		Scanner sc= new Scanner(System.in); 
		
		String s1= sc.nextLine();
		String s2= sc.nextLine(); 
		int[][] cach= new int[s1.length()+1][s2.length()+1]; 
		for(int[] row:cach)
		{
			Arrays.fill(row,-1);
		}
		 System.out.println(check(s1,s2,0,0,cach));
    }
}
