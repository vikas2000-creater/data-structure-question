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
		bt.levelOrderZZ();
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

		public void levelOrderZZ() {
			
			// write your code here 
			
         Stack<Node> cl= new Stack<>();
		 Stack<Node> nl= new Stack<>(); 
		 boolean check=true;  
		// System.out.println(root.data);  
		 cl.push(root);
		 while(true)
		 {   
			 	 //System.out.println(root.data);  
               while(!cl.isEmpty())
			   { 
				   if(check==true)
			     {
					 if(cl.peek().left!=null)
					 {
						 nl.push(cl.peek().left);
					 } 
					  if(cl.peek().right!=null)
					 { 

						 nl.push(cl.peek().right);
					 }  
					 System.out.print(cl.peek().data+" ");
					 cl.pop();
				 } 
				   else if(check==false)
			         {
					 
					  if(cl.peek().right!=null)
					 { 

						 nl.push(cl.peek().right);
					 }  
					 if(cl.peek().left!=null)
					 {
						 nl.push(cl.peek().left);
					 }  
					 	 System.out.print(cl.peek().data+" ");
					 cl.pop();
				 }  

			   } 
			   check=!check; 
			   Stack<Node> temp= cl;
			   cl=nl;
			   nl=temp; 
			   if(cl.isEmpty()==true && nl.isEmpty()==true)
			   {
				   break;
			   }
		 }
		 
		}

	} 
}

