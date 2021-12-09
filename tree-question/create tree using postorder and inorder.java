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
		int[] post = takeInput();
		int[] in = takeInput();
		BinaryTree bt = m.new BinaryTree(post, in);
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

		public BinaryTree(int[] post, int[] in) {
			this.root = this.construct(post, 0, post.length - 1, in, 0, in.length - 1);
		}  
		int idx=0;
		 public int max(int [] inorder,int s,int e, int curr)
    {
        for(int i=s;i<=e;i++)
        {
            if(inorder[i]==curr)
            {
                return i;
            } 
            
        } 
        return -1;
    } 
    
		public Node check(int[] inorder,int[] postorder, int s,int e)
    {
        if(s>e)
        {
            return null;
        } 
        if(idx<0)
        {
            return null;
        }
        
        Node temp= new Node(postorder[idx]); 
          idx--;  
        if(s==e)
        {
            return temp;
        }
      
     int find = max(inorder,s,e, temp.data);  
        temp.right=check(inorder,postorder,find+1,e);
        temp.left= check(inorder,postorder,0,find-1);
      
        return temp;
    }

		private Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {

			// write your code here  
			
			 idx= post.length-1;
       return  check(in,post,0,in.length-1);
        
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
