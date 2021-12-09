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
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
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
			this.root = this.takeInput(null,false);
		}

		public Node takeInput(Node parent,boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child,false);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child,false);
			}

			// return
			return child;
		}
		   
		public ArrayList<ArrayList<Integer>> levelArrayList() {
 
			// write your code here    
			
           ArrayList<ArrayList<Integer>> temp= new ArrayList<>();
		   ArrayList<Integer> al= new ArrayList<>(); 
			if(root==null)
			  return temp;
			Queue<Node> q=new LinkedList<>(); 
			q.add(root);
			q.add(null);
			while(!q.isEmpty())
			{    al= new ArrayList<>(); 
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
					 al.add(q.peek().data);
					 q.poll();
				 }  
				 	 temp.add(al);
				 if(q.peek()==null && q.size()==1)
				 {
					 break;
				 } 
				 else if(q.peek()==null && q.size()>1)
				 {
					 q.add(q.poll());
				 } 
			

			}
		
			
		return temp;
		}

	}

}
