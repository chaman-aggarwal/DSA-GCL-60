https://leetcode.com/problems/remove-nth-node-from-end-of-list/

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        
        ListNode* dummy = new ListNode(0);
        ListNode* fast = dummy;
        ListNode* slow = dummy;
        dummy->next = head;
        
        // move fast n times
        for(int i=1; i<=n; i++)
        {
            fast = fast->next;
        }
        
        // move both fast and slow
        while(fast->next!=NULL)
        {
            fast = fast->next;
            slow = slow->next;
        }
        
        slow->next = slow->next->next;
        
        return dummy->next;
        
    }
};