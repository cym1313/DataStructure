public class Node <E> {
	private E item;
	private Node next;
	
	public Node(E newitem, Node p) {
		item = newitem;
		next = p;
	}
	public E getitem() {return item;}
	public Node getNext() {return next;}
	public void setltem(E newltem) {item = newltem;}
	public void setNext(Node newNext) {next = newNext;}

}
