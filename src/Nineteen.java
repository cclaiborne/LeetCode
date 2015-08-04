public class Nineteen {

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		removeNthFromEnd(a, 1);
	}
	
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode current = head;
    	int length = 1;
    	while(current.next != null){
    		length++;
    		current = current.next;
    	}
    	current = head;
    	if (n == length){
    		head = current.next;
    		return head;
    	}
    	for (int i = 1; i<(length - n); i++){
    		current = current.next;
    	}
    	current.next = current.next.next;
        return head;
    }

}
