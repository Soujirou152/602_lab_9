import java.util.List;

public class LinkedList<E> {
	// You CANNOT add any additional fields!
	// (Pedagogical pain...)

	private Node<E> head;

	public static class Node<E> {
		E data;
		Node<E> next;
	}

	public LinkedList() {


	}

	/**
	 * Returns number of elements in list.
	 * 
	 * @return
	 */
	public int size() {

		int count = 0;
		Node<E> walker = head;

		while (walker != null) {
			count++;
			walker = walker.next;
		}
		return count;
	}

	/**
	 * Adds element as first node in list, with rest of list following.
	 * 
	 * @param element
	 */
	public void addFirst(E element) {
		
		Node<E> n = new Node<>();
		n.data = element;
		n.next = head;
		head = n;
	}

	/**
	 * Adds element as last node in list, after all of list before.
	 * 
	 * @param element
	 */
	public void addLast(E element) {
		Node<E> last = head;
		if (last == null) {
			Node<E> n = new Node<>();
			n.data = element;
			head = n;
		} else {
			while (last.next != null) {
				last = last.next;
			}
			Node<E> n = new Node<>();
			n.data = element;
			last.next = n;
			head = last;

		}
	}

	/**
	 * Returns (but doesn't remove) first element in list.
	 * 
	 * @return
	 */
	public E getFirst() {
		return head.data;
	}

	/**
	 * Returns (but doesn't remove) last element in list.
	 * 
	 * @return
	 */
	public E getLast() {

		Node<E> last = head;

		while (last.next != null) {
			last = last.next;
		}

		return last.data;
	}

	/**
	 * Remove and return first element in list.
	 * 
	 * @return
	 */
	public E removeFirst() {
		return null;
	}

	/**
	 * Remove and return last element in list.
	 * 
	 * @return
	 */
	public E removeLast() {
		return null;
	}

	/**
	 * Return (but don't remove) element at index i within list.
	 * 
	 * @param index
	 * @return
	 */
	public E get(int index) {
		return null;
	}

	public static void main(String[] args) {
		LinkedList<Object> linkedList = new LinkedList<>();
		
		StdOut.println(linkedList.size());
		linkedList.addFirst("red");
		StdOut.println(linkedList.getFirst());
		linkedList.addFirst("two");
		StdOut.println(linkedList.size());
		StdOut.println(linkedList.getFirst());
		linkedList.addFirst("three");
		linkedList.addLast("RED");
		StdOut.println(linkedList.size());
		StdOut.println(linkedList.getFirst());
		StdOut.println(linkedList.getLast());
		// linkedList.removeLast();
		//linkedList.addFirst("green");
		//StdOut.println(linkedList.getFirst());
		//
		// System.out.println("Display the linked list backward:");
		// for (int i = linkedList.size() - 1; i >= 0; i--)
		// {
		// System.out.print(linkedList.get(i) + " ");
		// }

		// Node<String> head = new Node<>();
		// head.data = "47";
		// head.next = new Node<String>();
		// head.next.data = "27";
		// head.next.next = new Node<String>();
		// head.next.next.data = "35";
		// head.next.next.next = new Node<String>();
		// head.next.next.next.data = "129302183";
		//
		// Node<String> walker = head;
		// while (walker != null) {
		// StdOut.println(walker.data);
		// walker = walker.next;
		// }

	}
}
