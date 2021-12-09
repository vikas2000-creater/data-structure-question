/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*; 
class BinaryTree{
	private Scanner sc = new Scanner(System.in);
	Node root; 
	Node ders;
	class Node{
		Node left;
		Node right;
		int data;
		Node(int val)
		{
			data= val;
		} 
	}   
	int s1;
	int s2;
	BinaryTree()
	{
		root= construct(); 
		s1= sc.nextInt();
		s2= sc.nextInt(); 
		ders=null;
		
	} 
	public Node construct()
	{
		int s= sc.nextInt();
		Node child= new Node(s); 
		boolean s1= sc.nextBoolean();
		if(s1)
		{
			child.left=construct();
		} 
		boolean s2= sc.nextBoolean();
		if(s2)
		{
			child.right=construct();
		} 
		return child;
	}  
	public Node check(Node root,int s1,int s2)
	{
		if(root==null)
		{
			return  null;
		} 
		if(root.data==s1|| root.data==s2)
		{
			return root;
		} 
		Node s3= check(root.left, s1,s2);
		Node s4=check(root.right,s1,s2);
		if(s3!=null && s4!=null)
		{
			return root;
		} 
		else if(s3!=null)
		{  
            return s3;
		} 
		else
		{
			return s4;
		}
	}
	
}
public class Main {
    public static void main(String args[]) { 
    BinaryTree bn= new BinaryTree();  

	BinaryTree.Node temp=bn.check(bn.root,bn.s1,bn.s2); 
	System.out.println(temp.data);


    }
}