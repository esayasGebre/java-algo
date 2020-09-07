package ja.hackerrank;

public class DeleteNodeLinkedlist {

	/*
	  Delete Node at a given position in a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/
	    // This is a "method-only" submission. 
	    // You only need to complete this method. 

	Node Delete(Node head, int position) {
	  // Complete this method
	    Node temp1 = head;
	    Node temp2;
	    int c = 0;
	    if(head == null)
	        return head;
	    if(position == 0){
	        temp1 = head;
	        head = head.next;
	        temp1 = null;
	    }
	    else{
	        temp2 = new Node();
	        while(c != position){
	            temp2 = temp1;
	            temp1 = temp1.next;
	            c++;
	        }
	        temp2.next = temp1.next;
	        temp1=null;
	    }
	return head;
	}


	
}
