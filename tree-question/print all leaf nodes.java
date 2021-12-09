/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*; 
 class BinaryTree{
   private Scanner sc= new Scanner(System.in);
   Node root;
   class Node
   {
	   Node left;
	   Node right;
	   int data;
	   Node(int val)
	   {
		   data=val;
	   } 
   } 
   public BinaryTree()
   {
	  root= contruct();
   } 
   public Node contruct()
   {
	   Queue<Node> q= new LinkedList<>(); 
     Node temp= new Node(sc.nextInt());
	   q.add(temp); 
	   while(!q.isEmpty())
	   {
		   Node k= q.poll();
		   int a= sc.nextInt();
		   int b= sc.nextInt();
		   if(a!=-1)
		   {
			Node temp1= new Node(a);  
			k.left=temp1;
			q.add(temp1);
		   } 
         if(b!=-1)
		 {
			 Node temp2= new Node(b); 
			 k.right=temp2;
			 q.add(temp2);
		 }
	   } 
	   return temp;
   }  
   ArrayList<Integer> al= new ArrayList<>(); 
   public void check(Node root ,int m)
   {    
	   if(root==null)
	   {
		   return;
	   }
	   if(root.left==null && root.right==null)
	   {
		   al.add(root.data);
		   return;
	   } 
	   check(root.left,1);
	   check(root.right,1);
   }
   public ArrayList<Integer> check(Node root)
   {    check(root,1);
	   return al;
   }
}
public class Main {
    public static void main(String args[]) {
		BinaryTree  bn= new BinaryTree();
           ArrayList<Integer> ans=bn.check(bn.root);
		   for(int i=0;i<ans.size();i++)
		   {
			   System.out.print(ans.get(i)+" ");
		   }

    }
}
