
public class TwentyOne {

	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		ListNode six = new ListNode(6);
		mergeTwoLists(one, four);

	}
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode head = new ListNode(0);
    	ListNode l1Current = l1;
    	ListNode l2Current = l2;
    	ListNode current = head;
    	while(l1 != null && l2 != null){
    		if (l1.val <= l2.val)
    			current = new ListNode(l1.val);
    		else
    			current = new ListNode(l2.val);
    		current = current.next;
    	}
    	
        return head;
    }

}
