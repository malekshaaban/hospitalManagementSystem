package classes;
import java.util.Stack;

import javax.swing.text.html.parser.DTD;

public class doctorsTree  {
	
	private Node root;
	private int size;
	
	
	
	
	
	
	
	
	
	
	
	public doctorsTree(Node root, int size) {
		super();
		this.root = root;
		this.size = size;
	}


	/** Create a default binary tree */
	public doctorsTree()
	{
	root = null;
	size = 0;
	}

	
	private Node createNewNode(Doctor d) {
		return new Node(d);
		}
		/** Get the number of nodes in the tree */
		public int getSize() {
		return size;
		}
		/** Returns the root of the tree */
		public Node getRoot() {
		return root;
		}

	
		public boolean insert(Doctor d) {
			if (root == null)
			root = createNewNode(d); // Create a new root
			else {
			// Locate the parent node
			Node parent = null;
			Node current = root;
			
			
			
			while (current != null){
			if (d.getName().compareTo( current.getDoctor().getName())<0) {
			parent = current;
			current = current.getLeft();
			}
			else if (d.getName().compareTo( current.getDoctor().getName())>0) {
			parent = current;
			current = current.getRight();
			}
			else
			return false; // Duplicate node not inserted
			}
			// Create the new node and attach it to the parent 
			
			if (d.getName().compareTo(parent.getDoctor().getName()) < 0)
			parent.setLeft(createNewNode(d));
			else
			parent.setRight(createNewNode(d));
			}
			size++;
			return true; // Element inserted
			}
		
		
       
		
		

		
		
		
		
		
		
		
	
	
		public void inorder(Node root) 
		{
		if (root == null) 
		return;
		inorder(root.getLeft());
		//System.out.print(root.getDoctor() + " ");
		
		inorder(root.getRight());
		System.out.print(root.getDoctor() + " ");
		}
		
		
		public void inOrderWithoutRecursion() {
			Stack nodes = new Stack<>();
			Node current=root;
			while (!nodes.isEmpty() || current != null) { 
			if (current != null) { 
			nodes.push(current);
			current=current.getLeft(); 
			} 
			else { 
			Node node = (Node) nodes.pop();
			System.out.printf("%s ", node.getDoctor());
			System.out.println();
			current = node.getRight();
			} 
			} 
			}
		
	
		
				
		
		
		
		
		
		
		
		
	
	
		public boolean delete(Doctor d) {
			// Locate the node to be deleted and also locate its parent node
			Node parent = null;
			Node current = root;
			while (current != null) {
				if (d.getName().compareTo(current.getDoctor().getName())< 0) {
				parent = current;
				current = current.getLeft();
				}
				else if (d.getName().compareTo(current.getDoctor().getName()) > 0) {
				parent = current;
				current = current.getRight();
				}
				else
				break; // Element is in the tree pointed at by 
				//current
				}
			if (current == null)
				return false; // Element is not in the tree
				// Case 1: current has no left children
				if (current.getLeft() == null) {
				// Connect the parent with the right child of the 
				//current node
				if (parent == null) {
				root = current.getRight();
				}
				else {
				if (d.getName().compareTo(parent.getDoctor().getName()) <0)
				parent.setLeft(current.getRight());
				else
				parent.setRight(current.getRight());
				}
				}else {// Case 2: The current node has a left child
					// Locate the rightmost node in the left subtree of
					// the current node and also its parent
					Node parentOfRightMost = current;
					Node rightMost = current.getLeft();
					while (rightMost.getRight() != null) {
					parentOfRightMost = rightMost;
					rightMost = rightMost.getRight(); // Keep going to 
					//the right
					}
					// Replace the element in current by the element in 
					//rightMost
					current.setDoctor(rightMost.getDoctor());
					// Eliminate rightmost node
					if (parentOfRightMost.getRight() == rightMost)
					parentOfRightMost.setRight(rightMost.getLeft());
					else // Special case: parentOfRightMost == current
					parentOfRightMost.setLeft(rightMost.getLeft()); 
					}
				size--;
					return true; // Element inserted
		}

	
		public String searcByNameGetPassword(String name) {
			Node current = root; // Start from the root
			while (current != null) {
			if (name.compareTo(current.getDoctor().getName()) < 0)
			current = current.getLeft();
			else if (name.compareTo(current.getDoctor().getName()) > 0)
			current = current.getRight();
			else // element matches current.getElement()
			return current.getDoctor().getPassword(); // Element is found
			}
			return "not found";
			}
			}
	
	
	
	
	
	
