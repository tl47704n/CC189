package linkedlist;

public class FindKthLastNode {
	public FindKthLastNode() {
		// TODO Auto-generated constructor stub
	}
	public LinkedListNode findKthLastNode(LinkedListNode head, int k){
		Index idx = new Index();
		return findKthLastNode(head,k,idx);
	}	
	LinkedListNode findKthLastNode(LinkedListNode head, int k, Index idx) {
		if(head==null) {
			return null;
		}
		
		LinkedListNode node = findKthLastNode(head.next,k,idx);
		idx.value=idx.value+1;
		if(idx.value==5) {
			return head;
		}
		return node;
	}
	
}
class Index{
	public int value=0;
}
