/**
 * Node
 *
 * 		A member of a linked list that holds an integer value and a link to another node
 *
 * 
 */

public class Node {
	
	private Object value;
	private Node next;
	private Node previous;

	/**
	 * Constructors
	 */
	public Node(){
		this(0, null);
	}

	public Node(Object value){
		this(value, null);
	}

	public Node(Object value, Node next){
		this.value = value;
		this.next = next;
	}
	
	public Node(Object value, Node next, Node previous){
		this.value = value;
		this.next = next;
		this.setPrevious(previous);
	}

	/**
	 *Getters and Setters
	 */
	public void setValue(Object value){
		this.value = value;
	}

	public void setNext(Node next){
		this.next = next;
	}

	public Object getValue(){
		return value; 
	}

	public Node getNext(){
		return next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	/**
	 * toString
	 * 		returns the value and node reference of this node in string format
	 */
	public String toString(){
		boolean nextExists = true;
		if(getNext() == null){
			nextExists = false;
		}
		return "value: " + value + ", next Node reference: " + nextExists + "\t"; 
	}
}