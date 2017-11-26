package linkedlist;

public class DeleteMid {
	public DeleteMid() {
		// TODO Auto-generated constructor stub
	}
	public void deleteMid(LinkedListNode mid){
		if(mid==null||mid.next==null) {
			throw new IllegalArgumentException();
		}
		mid.data=mid.next.data;
		mid.next=mid.next.next;
	}
}
