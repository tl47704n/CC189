package linkedlist;

public class RemoveDupNoHash {
	public RemoveDupNoHash() {
		// TODO Auto-generated constructor stub
	}
	public void removeDup(LinkedListNode n) {
		
		while(n!=null) {
			
			LinkedListNode runner = n;
			while(runner.next!=null) {
				if(runner.next.data==n.data) {
					runner.next=runner.next.next;
				}
				else {
				runner=runner.next;
				}
			}
			n=n.next;
			
		}
	}
}
