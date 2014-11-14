/**
 * Node
 *
 * 		A member of a linked list that holds an integer value and a link to another node
 *
 * 
 */

public class Node {
	
	private Data value;
	private Node next;
	private Node previous;

	/**
	 * Constructors
	 */
	public Node(){
		this(null, null);
	}

	public Node(Data value){
		this(value, null);
	}

	public Node(Data value, Node next){
		this.value = value;
		this.next = next;
	}

	/**
	 *Getters and Setters
	 */
	public void setValue(Data value){
		this.value = value;
	}

	public void setNext(Node next){
		this.next = next;
	}

	public Data getValue(){
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
	
	public boolean hasNext(){
		if(this.next != null){
			return true;
		}
		else return false;
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