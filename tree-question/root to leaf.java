/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*; 
class BinaryTree{
private Scanner sc= new Scanner(System.in); 
        Node root; 
		int ans;
	class Node{
		 Node left;
			Node right;
		int data;
		public Node(int val)
		{   
			
			data=val;
		}

	} 
	public BinaryTree()
	{  
	 root=construct(null,false); 
	 ans= sc.nextInt();
	}  
  
	public Node construct( Node root,boolean ilc)
	{
         int s= sc.nextInt();
		 Node child= new Node(s);
		 boolean hlc= sc.nextBoolean();

		 
		  if(hlc)
		 {     
			
			 child.left=construct(child,true);
			 
		 } 
		 boolean  hrc= sc.nextBoolean();
		 if(hrc)
		 {     
            child.right=construct(child,false);
			 
		 } 
		 return child;  
		 
		
		
	}    
	public void check(Node root,int ans, String sum,int red)
	{   
		if(root==null)
		{
			return;
		} 
       if(root.left==null && root.right==null)
	   {
		  if(red+root.data==ans)
		  {
			  System.out.println(sum+" "+ root.data+" ");
		  }  
		  else
		  {
			  return;
		  }
	   } 
	   check(root.left,ans,sum+" "+root.data,red+root.data);
	     check(root.right,ans,sum+" "+root.data,red+root.data);
          return;

	}
}
public class Main { 
	
    public static void main(String args[]) { 
	
    BinaryTree bn= new BinaryTree();
	
bn.check(bn.root,bn.ans,"",0); 

		

    }
}