#include <iostream>
using namespace std;

class Node{
public:
    int data;
    Node *next;

    Node(int d)
    {
        data = d;
        next = NULL;
    }
};

void insertionAtHead(Node*&head, int data)
{
    Node *new_Node = new Node(data);
    new_Node -> next = head;
    head = new_Node;
}

void deleteAtHead(Node*&head)
{
    if(head==NULL)
    {
        return;
    }
    head = head->next;
}

void deleteAtTail(Node*&head)
{
    // TODO : delete a node when linkedlist lenth is 0 or 1
    Node*prev = NULL;
    Node*temp = head;

    while(temp->next!=NULL)
    {
        prev = temp;
        temp = temp->next;
    }

    prev->next = NULL;
}

void print(Node*head)
{
    Node *temp = head;
    while(temp!=NULL)
    {
        cout<<temp->data<<"-->";
        temp = temp->next;
    }
    cout<<endl;
}

int main() {

    Node* head = NULL;  

    insertionAtHead(head, 1);
    insertionAtHead(head, 2);
    insertionAtHead(head, 3);
    insertionAtHead(head, 4);
    insertionAtHead(head, 5);

    deleteAtHead(head);
    deleteAtHead(head);
    deleteAtTail(head);

    print(head);
    return 0;
}

// 3->2
