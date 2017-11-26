package linkedlist;

public class PartitionLinklist {
	public PartitionLinklist() {
		// TODO Auto-generated constructor stub
	}
	public LinkedListNode partitionOptimal(LinkedListNode n, int x) {
		LinkedListNode head = n;
		LinkedListNode tail = n;
		while(n!=null) {
			LinkedListNode next=n.next;
			if(n.data<x) {
				n.next=head;
				head=n;
				
			}else {
				tail.next=n;
				tail=n;
			}
			n=next;
		}
		tail.next=null;
		return head;
	}

	public LinkedListNode partition(LinkedListNode n, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;
		while (n != null) {
			if (n.data < x) {
				if (beforeStart == null) {
					beforeStart = n;
					beforeEnd = n;
				} else {
					beforeEnd.next = n;
					beforeEnd = n;
				}
			} else {
				if (afterStart == null) {
					afterStart = n;
					afterEnd = n;
				} else {
					afterEnd.next = n;
					afterEnd = n;
				}

			}
			n = n.next;
		}
		if (beforeStart == null) {
			return afterStart;
		} else if (afterStart == null) {
			return beforeStart;
		} else {
			beforeEnd.next = afterStart;
		}
		return beforeStart;
	}
}
