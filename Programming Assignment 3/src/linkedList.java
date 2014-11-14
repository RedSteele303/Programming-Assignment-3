/**
 * linkedList
 *
 * 		creates and manages a linked list
 *
 */
public class linkedList {
	
	private static Node head;

	/**
	 * Constructor
	 */
	public linkedList(){
		this.head = new Node();
	}

	/**
	 * Constructor
	 * 
	 * @param  value - the value you want the head to have
	 * 
	 */
	public linkedList(Data value){
		this.head = new Node(value);
	}

	/**
	 * getter
	 */
	public static Node getHead(){
		return head;
	}
	
	public void setHead(Data data){
		this.head = new Node(data);
	}

	/**
	 * push
	 * 		add a new node to the linked list
	 *
	 * @param  object - the value you want the new Node to hold
	 */
	public static void push(Data object){
		Node next = new Node(object);
		Node now = head;
		while(now.hasNext()){
			now = now.getNext();
		}
		now.setNext(next);
	}

	/**
	 * length
	 * 		returns the number of nodes in the list
	 *
	 * @return - int
	 */
	public static int length(){
		Node now = head;
		int length = 0;
		while(now.hasNext()){
			now = now.getNext();
			length++;
		}
		return length;
	}


	/**
	 * print
	 * 		prints the linked list to the screen
	 */
	public static void print(){
		int length = length();
		Node now = head;
		for(int i = 0; i<=length; i++){
			System.out.print("Node " + i + ": " + now);
			now = now.getNext();
		}	
		System.out.println("The list has finished printing.");
	}

	/**
	 * count
	 * 		counts the number of times a certain number occurs in the linked list
	 *
	 * @param num - the number you want to look for in the linkedList
	 *
	 * @return int
	 * 
	 */
	public static int count(Object what){
		int length = length();
		Node now = head;
		int count = 0;
		for(int i = 0; i<length; i++){
			now = now.getNext();
			if(now.equals(what)){
				count++;
			}
		}
		return count;
	}

	/**
	 * getNth
	 * 		returns the value of the node at the nth index of the list
	 *
	 * @param n - the index that you want to find the value of
	 *
	 * @return Object
	 * 
	 */
	public static Data getNth(int n){
		Data value;
		Node now = head.getNext();
		for(int i = 0; i<n; i++){
			now = now.getNext();
		}
		value = now.getValue();
		return value;
	}

	/**
	 * empty 
	 * 		empties the list
	 */
	public static void empty(){
		head.setNext(null);
	}

	/**
	 * pop
	 * 		removes the first element from the list and returns its value
	 *
	 * precondition - the list may not be empty
	 * 
	 * @return Object
	 */
	public static Object pop(){
		Node first = head.getNext();
		Node now = first.getNext();
		head.setNext(now);
		return first.getValue();
	}

	/**
	 * linearSearch
	 * 		Given an Object n, returns the index where it is found
	 *
	 * @param n - the Object you want to find the index of
	 *
	 * @return Object
	 */
	public static int linearSearch(Object n){
		Node now = head;
		int length = length();
		int index = -1;
		for(int i = 0; i<length; i++){
			now = now.getNext();
			if(now.getValue() == n){
				index = i;
			}
		}
		return index;
	}

	/**
	 * insertNth
	 * 		insert the given value into the linked list at the given n index
	 *
	 * @param value - value that the user wants inserted into the linkedList
	 * @param  n - index that you want the value to be inserted into
	 */
	public static void insertNth(Data value, int index){
		Node n = new Node(value);
		Node now = head;
		if(index == 0){
			push(value);
		}
		if(index > length()){
			return;
		}
		for(int i = 0; i<=index; i++){
			now = now.getNext();
			if(i == index-1){
				n.setNext(now.getNext());
				now.setNext(n);
			}
		}
	}

	/**
	 * sortedInsert
	 * 		creates and inserts a node into a sorted linkedList so that the list stays sorted
	 *
	 * precondition: the list must be sorted in ascending order
	 * @param  value - value of the node you want to insert
	 * 
	 */
	public static void sortedInsert(Data value){
		Node now = head.getNext();
		int index = 0;
		boolean run = true;
		while(run && now.getValue().equals(value)){
			index++;
			if(now.getNext() != null){
				now = now.getNext();
			}else{
				run = false;;
			}	
		}
		insertNth(value, index);
	}

	/**
	* insertSort
	*		rearranges nodes in list so they are sorted in ascending order
	*
	**/
	public static void insertSort(){
	
	}

	/**
	* append
	*	given another LinkedList, appends the values from that list to the end of this list
	*
	*@param list - the LinkedList you wish to append to this list
	*
	**/
	public static void append(linkedList list){
   		Node now = head;
   		for(int i = 0; i<length(); i++){
   			now = head.getNext();
   		}
   		now.setNext(list.getHead().getNext());
	}	

	/**
	* frontBackSplit
	*		return a length 2 array of LinkedLists that contains the front and back halves of the list
	*
	*@return LinkedList[2]
	*
	**/
	public static linkedList[] frontBackSplit(){
		int halfLength = length()/2;
		linkedList first = new linkedList();
		linkedList second = new linkedList();
		linkedList[] halves = {first, second};
		Node now = head;
		for(int i = 0; i<halfLength; i++){
			now = now.getNext();
			first.push(now.getValue());
		}
		for(int i = halfLength; i<length(); i++){
			now = now.getNext();
			second.push(now.getValue());
		}
		return halves;
	}
	
	/**
	* removeDuplicates
	* 		deletes any duplicate nodes from the list
	*
	*precondition: the list must be sorted in increasing order
	*
	**/
	public static void removeDuplicates(){
		Node now = head.getNext();
		Node next = now.getNext();
		Object posDup = now.getValue();
		for(int i = 1; i<length(); i++){
			if(next.getValue() == posDup){
				now.setNext(next.getNext());
			}
		}
	}

	/**
	* alternatingSplit
	*		returns a length 2 array of LinkedLists; the first list consists of the values of the odd nodes, and the second consists of the values of the even nodes
	 * @return 
	*
	*@return LinkedList[2]
	*
	**/
	public static linkedList[] alternatingSplit(){
		linkedList first = new linkedList();
		linkedList second = new linkedList();
		linkedList[] halves = {first, second};
		Node now = head;
		for(int i = 0; i<length(); i++){
			now = now.getNext();
			if(i%2 == 1){
				first.push(now.getValue());
			}else{
				second.push(now.getValue());
			}	
		}
		return halves;
	}	


}