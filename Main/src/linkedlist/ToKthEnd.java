package linkedlist;

public class ToKthEnd {
	public ToKthEnd() {
		// TODO Auto-generated constructor stub
	}
	public LinkedListNode toKthEnd(LinkedListNode head, int k) {
		LinkedListNode p1=head;
		LinkedListNode p2=head;
		for(int i=0;i<k;i++) {
			p1=p1.next;
		}
		while(p1!=null) {
			p1=p1.next;
			p2=p2.next;
		}
		return p2;
	}
}
