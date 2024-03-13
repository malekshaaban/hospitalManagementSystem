package classes;

public class Node {
	
	
		private  Doctor doctor;
		private  Node left;
		private Node right;

		

		 
		 

		  public Node(Doctor doctor) {
		    this.doctor = doctor;
		    left = null;
		    right=null;
		   
		  }




		public Doctor getDoctor() {
			return doctor;
		}




		public void setDoctor(Doctor doctor) {
			this.doctor = doctor;
		}




		public Node getLeft() {
			return left;
		}




		public void setLeft(Node left) {
			this.left = left;
		}




		public Node getRight() {
			return right;
		}




		public void setRight(Node right) {
			this.right = right;
		}




		@Override
		public String toString() {
			return "Node [doctor=" + doctor + "]";
		}


		  
		 
		  
		}


