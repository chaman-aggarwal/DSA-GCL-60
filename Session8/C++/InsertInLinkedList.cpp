#include <iostream>
using namespace std;

class Node{
public:
    int data;
    Node *next;

    //constructor
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

void insertionAtTail(Node*&head, int data)
{
    if(head==NULL)
    {
        head = new Node(data);
        return;
    }

    Node*temp = head;
    while(temp->next!=NULL)
    {
        temp = temp->next;
    }
    
    temp->next = new Node(data);
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

    insertionAtTail(head, 8);

    print(head);
    return 0;
}

