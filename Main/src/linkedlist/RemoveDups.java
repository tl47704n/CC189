package linkedlist;

import java.util.HashSet;

public class RemoveDups {
	
		public RemoveDups() {
				// TODO Auto-generated constructor stub
	}

		public void removeDups(LinkedListNode n){
			HashSet<Object> set = new HashSet<Object>();
			LinkedListNode previous = new LinkedListNode(null);
			while(n!=null) {
				if(set.contains(n.data)) {
					
					previous.next=n.next;
				}else {
					previous=n;
					set.add(n.data);
				}
				
				n=n.next;
			}
		}
}
