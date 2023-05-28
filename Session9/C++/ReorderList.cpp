https://leetcode.com/problems/reorder-list/

class Solution {
    
    ListNode* getMid(ListNode* head)
    {
        ListNode* fast = head;
        ListNode* slow = head;
        while(fast!=NULL && fast->next!=NULL)
        {
            fast = fast->next->next;
            slow = slow->next;
        }
        return slow;
    }
    
    ListNode *reverse(ListNode* head)
    {
        ListNode* curr = head;
        ListNode* prev = NULL;
        ListNode* nextNode;
        
        while(curr!=NULL)
        {
            nextNode = curr->next;
            curr->next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        return prev;
    } 
    
public:
    void reorderList(ListNode* head) {
        
        if(head==NULL || head->next==NULL || head->next->next==NULL) {
            return;
        }
        
        ListNode* mid = getMid(head);
        ListNode* secondHalf = mid->next;
        mid->next = NULL;
        
        ListNode* revHead = reverse(secondHalf);

        while(revHead)
        {
            ListNode* save = head->next;
            head->next = revHead;
            revHead = revHead->next;
            head->next->next = save;
            head = save;
        }
        
    }
};