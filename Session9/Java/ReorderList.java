https://leetcode.com/problems/reorder-list/

class Solution {

    private ListNode getMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }

    private ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode nextNode;
        
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        return prev;
    }

    public void reorderList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        
        ListNode mid = getMid(head);
        ListNode secondHalf = mid.next;
        mid.next = null;
        
        ListNode revHead = reverse(secondHalf);
        
        while (revHead != null) {
            ListNode save = head.next;
            head.next = revHead;
            revHead = revHead.next;
            head.next.next = save;
            head = save;
        }
    }
}
