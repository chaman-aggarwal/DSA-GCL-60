https://leetcode.com/problems/reverse-nodes-in-k-group/

class Solution {  
    
    ListNode* reverse(ListNode* head, ListNode* tail)
    {
        ListNode* curr = head;
        ListNode* prev = NULL;
        ListNode* next;
        
        while(curr!=tail)
        {
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
        
        if(k<=1){
            return head;
        }
        ListNode* itr = head;
        for(int i=0; i<k; i++)
        {
            if(itr==NULL){
                return head;
            }
            itr = itr->next; 
        }
        
        ListNode* newHead = reverse(head, itr);
        head->next = reverseKGroup(itr, k);
        return newHead;   
    }
};