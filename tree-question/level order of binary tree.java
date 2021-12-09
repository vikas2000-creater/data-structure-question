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
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderNewLine();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
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

		public void levelOrderNewLine() {

			// write your code here 
			Queue<Node> q= new LinkedList<>();
			q.add(root);
			q.add(null);
			while(!q.isEmpty())
			{
				while(q.peek()!=null)
				{
					if(q.peek().left!=null)
					{
						q.add(q.peek().left);
					} 
					
					if(q.peek().right!=null)
					{
						q.add(q.peek().right);
					} 
					System.out.print(q.peek().data+" ");
					q.poll();
				} 
				if(q.peek()==null &&q.size()==1)
				{
					break;
				} 
				else if(q.peek()==null && q.size()>1)
				{ 
                  	System.out.println();
					  q.add(q.poll());
				}
			}
		}

	}

}
