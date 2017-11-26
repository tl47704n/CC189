package linkedlist;

public class AddTwoList {
	public AddTwoList() {
		// TODO Auto-generated constructor stub
	}
	public LinkedListNode addtwoList(LinkedListNode n1,LinkedListNode n2, int carry) {
		int value=carry;	
		LinkedListNode result=null;
		if(n1!=null) {
			value+=n1.data;
		}
		if(n2!=null) {
			value+=n2.data;
		}
		result.data=value%10;
		
		if(n1!=null||n2!=null) {
			LinkedListNode resultNext = addtwoList(n1.next,n2.next,value>=10 ? 1 : 0);
			result.next=resultNext;
		}
		return result;
	}
}
