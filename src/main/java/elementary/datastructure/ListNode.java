package elementary.datastructure;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListNode<T> {
	public T data;
	public ListNode<T> next;

	public static ListNode<Integer> search(ListNode<Integer> node, int key) {
    ListNode<Integer> p = node;
    while (p != null && p.data != key) {
    	p = p.next;
    }
    // If key was not present in the list, p will have become null
    return p;
	}

	public static void insertAfter(ListNode<Integer> node, ListNode<Integer> newNode) {
		newNode.next = node.next;
		node.next = newNode;
	}

	// Deleting the node immediately following node. Assume that node is not null
	public static void deleteList(ListNode<Integer> node) {
		node.next = node.next.next;
	}

	public static ListNode<Integer> makeNode(int data) {
		ListNode<Integer> node = new ListNode<>();
		node.data = data;
		return node;
	}

	public static int[] toArray(ListNode<Integer> node) {
		LinkedList<Integer> list = new LinkedList<>();
		ListNode<Integer> p = node;
		while (p != null) {
			list.addLast(p.data);
			p = p.next;
		}

		int[] a = new int[list.size()];
		ListIterator<Integer> iterator = list.listIterator();
		for (int i = 0; i < a.length; i++) {
			a[i] = iterator.next();
		}
		return a;
	}

	public static ListNode<Integer> fromArray(int[] a) {
		if (a.length == 0)
			return null;

		ListNode<Integer> head = new ListNode<>();
		head.data = a[0];

		ListNode<Integer> p = head;
		for (int i = 1; i < a.length; i++) {
			ListNode<Integer> node = makeNode(a[i]);
			p.next = node;
			p = node;
		}

		return head;
	}
}
