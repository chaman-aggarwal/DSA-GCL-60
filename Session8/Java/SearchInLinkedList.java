class SearchInLinkedList
{
	Node head; 
	class Node
	{
		int data;
		Node next;
		Node(int d) 
		{
			data = d; 
			next = null; 
		}
	}

	public void insertionAtHead(int data)
	{

		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

    boolean searchIterative(int key)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    boolean searchRecursive(Node head, int key)
    {
        // base case
        if(head==null){
            return false;
        }
        if(head.data==key){
            return true;
        }
        return searchRecursive(head.next, key);
    }

	public static void main(String[] args)
	{
		SearchInLinkedList llist = new SearchInLinkedList();

		llist.insertionAtHead(1);
		llist.insertionAtHead(2);
		llist.insertionAtHead(3);
		llist.insertionAtHead(4);
		llist.insertionAtHead(5);

        if(llist.searchIterative(10)){
            System.out.println("Node is Present");
        }
        else{
            System.out.println("Not Present");
        }

        if(llist.searchRecursive(llist.head, 1)){
            System.out.println("Node is Present");
        }
        else{
            System.out.println("Not Present");
        }
	}
}
