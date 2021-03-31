
public class Node <E> {
	private E item;
	private Node<E> next;
	public Node(E newItem, Node<E> node) {
		item = newItem;
		next = node;
	}
	public E getItem() {
		return item;
	}
	public void setItem(E newitem) {
		this.item = newitem;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> newnext) {
		this.next = newnext;
	}
}
