https://leetcode.com/problems/intersection-of-two-linked-lists/

public class Solution {
    
    private int getLength(ListNode head)
    {
        int count = 0;
        while(head!=null)
        {
            count++;
            head = head.next;
        }
        
        return count;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        int l1 = getLength(tempA);
        int l2 = getLength(tempB);
        
        int diff = l1 > l2 ? l1-l2 : l2-l1;
        if(l1<l2)
        {
            while(diff>0)
            {
                diff--;
                tempB = tempB.next;
            }
        }
        else
        {
            while(diff>0)
            {
                diff--;
                tempA = tempA.next;
            }
        }
        
        while(tempA!=null)
        {
            if(tempA==tempB)
            {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        
        return null;
    }
}