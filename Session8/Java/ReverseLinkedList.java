https://leetcode.com/problems/reverse-linked-list/

class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode nextNode;
        
        while(curr!=null)
        {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        return prev;
        
    }
}

