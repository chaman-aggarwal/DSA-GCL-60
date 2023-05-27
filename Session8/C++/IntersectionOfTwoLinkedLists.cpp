https://leetcode.com/problems/intersection-of-two-linked-lists/

class Solution {
    
    int getLength(ListNode* head)
    {
        int count = 0;
        while(head!=NULL)
        {
            count++;
            head = head->next;
        }
        
        return count;
    }
    
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        
        ListNode* tempA = headA;
        ListNode* tempB = headB;
        
        int l1 = getLength(tempA);
        int l2 = getLength(tempB);
        
        int diff = l1 > l2 ? l1-l2 : l2-l1;
        if(l1<l2)
        {
            while(diff--)
            {
                tempB = tempB->next;
            }
        }
        else
        {
            while(diff--)
            {
                tempA = tempA->next;
            }
        }
        
        while(tempB!=NULL)
        {
            if(tempA==tempB)
            {
                return tempB;
            }
            tempA = tempA->next;
            tempB = tempB->next;
        }
        
        return NULL;
    }
};