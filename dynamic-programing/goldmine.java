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
		int t = sc.nextInt();
		while(t-->0){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[][] arr = new int[m][n];
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++)
				arr[i][j] = sc.nextInt();
			}
			int[][] cache = new int[m+1][n+1];
			for(int[] row: cache)
			Arrays.fill(row,-1);

			int max = Integer.MIN_VALUE;
			for(int i=0;i<m;i++)
			max = Math.max(max,goldmine(arr,cache,m,n,i,0));
			System.out.println(max);
		}
    }
	static int goldmine(int arr[][],int cache[][], int row, int col, int cr, int cc){

		if(cc==col || cr<0 || cr==row || cc<0)
		return 0;

		if(cache[cr][cc]!=-1)
		return cache[cr][cc];

		int tr = goldmine(arr,cache,row,col,cr-1,cc+1);
		int r = goldmine(arr,cache,row,col,cr,cc+1);
		int dr = goldmine(arr,cache,row,col,cr+1,cc+1);

		return cache[cr][cc] = Math.max(tr,Math.max(r,dr))+arr[cr][cc];
	}
}