/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*; 
//import java.Math;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced(bt.root));
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		 Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		

		private boolean isBalanced(Node node) {
			// write your code here   
            if(node==null)
            {
                return true;
            } 
            int c= height(node.left);
            int h= height(node.right);
            if(Math.abs(c-h)<=1 && isBalanced(node.left) && isBalanced(node.right))
            {
                return true;
            } 
            else
            {
                return false;
            }

			
		}   
        public int height(Node root)
        {
            if(root==null)
            {
                return 0;

            } 
            int c= height(root.left);
            int m= height(root.right);
            if(c>m)
            {
              return c+1;
            } 
            else{
                return  m+1;
            }  
           

        }

		private class BalancedPair {
			int height;
			boolean isBalanced;
		}

	}
}
