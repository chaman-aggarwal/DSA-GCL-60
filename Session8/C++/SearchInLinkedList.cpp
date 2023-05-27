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
    new_Node->next = head;
    head = new_Node;
}

bool searchIterative(Node*head, int key)
{
    while(head!=NULL)
    {
        if(head->data==key)
        {
            return true;
        }
        head = head->next;
    }
    return false;
}

bool searchRecursive(Node*head, int key)
{
    // base case
    if(head==NULL){
        return false;
    }
    if(head->data==key){
        return true;
    }
    return searchRecursive(head->next, key);
}

int main() {

    Node* head = NULL;  

    insertionAtHead(head, 1);
    insertionAtHead(head, 2);
    insertionAtHead(head, 3);
    insertionAtHead(head, 4);
    insertionAtHead(head, 5);

    if(searchIterative(head, 1)){
        cout<<"Node is Present"<<endl;
    }
    else{
        cout<<"Not Present"<<endl;
    }

    if(searchRecursive(head, 9)){
        cout<<"Node is Present"<<endl;
    }
    else{
        cout<<"Not Present"<<endl;
    }

    return 0;
}
