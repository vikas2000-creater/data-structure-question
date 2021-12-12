/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{   
   static int[] rC = { -1, -2, -2, -1, 1, 2, 2, 1 };
    static int[] cC = { -2, -1, 1, 2, -2, -1, 1, 2 };
    private static int sol2(int row, int col, int n, int[][][] dp) {
		// TODO Auto-generated method stub

		if (row < 0 || col < 0 || row >= 4 || col >= 3 || (row == 3 && col == 0) || (row == 3 && col == 2)) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}

        if(dp[row][col][n] != -1) {
            return dp[row][col][n];
        }
		int ct = 0;
		for (int i = 0; i < 8; i++) {
			ct = (ct + sol2(row + rC[i], col + cC[i], n - 1, dp)) % 1000000007;
		}

		return dp[row][col][n] = ( ct % 1000000007);
	}
	public static void main(String[] args) {
	    int n=1;
	     int[][][] dp = new int[4][3][n  + 1];
        
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k <= n; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        int ans = 0;
        for(int r = 0; r < 4; r++) {
            for(int c = 0; c < 3; c++) {

                ans = (ans + sol2(r, c, n - 1, dp)) % 1000000007;
            }
        }
       System.out.println(ans);
        
		
	}
}
