
import java.util.*;
public class Main { 
	public static int check(int[] arr,int am,int curr,int[][] cach)
	{   int d=0; 
		if(am==0)
		{
			return 1;
		} 
		if(curr==arr.length)
		{
			return 0;
		}  
		if(cach[curr][am]!=-1)
		{
			return cach[curr][am];
		}
		if(am>=arr[curr])
		{
			d= check(arr, am-arr[curr],curr,cach);
		} 
		int c= check(arr,am,curr+1,cach);
		return cach[curr][am]=c+d;
	}
    public static void main(String args[]) { 
		int n;
		Scanner sc= new Scanner(System.in); 
		n= sc.nextInt();
		int k= sc.nextInt();
		int[] arr= new int[k]; 
		for(int i=0;i<k;i++)
		{
			arr[i]= sc.nextInt();
		} 
		int[][] cach= new int[k+1][n+1]; 
		for(int[] row:cach)
		{
			Arrays.fill(row,-1);
		}
		System.out.println(check(arr,n,0,cach));
        // Your Code Here
    }
}

