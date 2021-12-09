/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		int[] pre = takeInput();
		int[] in = takeInput(); 
		//idx=0;
		BinaryTree bt = m.new BinaryTree(pre, in);
		bt.display();
	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right; 
			Node(int val)
			{
				data=val;
			}
		}

		private Node root;
		private int size;

		public BinaryTree(int[] pre, int[] in) {
			this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
		   // dis();
		 }  
		public void dis()
		{
			Node temp= root;
			System.out.println(root.left.data);
		}
		int idx=0; 
		public int fin(int[] in ,int s,int e,int val)
		{
			for(int i=s;i<=e;i++)
			{
				if(in[i]==val)
				{
					return i;
				}
			} 
			return -1;
		} 
public Node check(int[] pre,int[] in ,int i,int n)
{
	      if(i>n)
		  {
			  return null;
		  }  
		  if(idx> pre.length-1)
		  {
			  return null;
		  }
		  Node temp= new Node(pre[idx]);  
		  //System.out.println(temp.data+" "+idx);
		    idx++;
		  if(i==n)
		  {
			  return temp;
		  }
		  int find= fin(in,temp.data, i,n);
		  temp.left=check(pre,in,0,find-1); 
		  temp.right=check(pre,in, find+1,n); 
           
		  return temp;
}
private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
     return check(pre,in, 0,in.length-1);
		
		}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

	}

}
