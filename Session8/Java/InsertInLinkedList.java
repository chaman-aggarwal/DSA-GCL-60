class InsertInLinkedList
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

	public void insertionAtTail(int new_data)
	{
		if (head == null)
		{
			head = new Node(new_data);
			return;
		}

		Node temp = head;
		while (temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = new Node(new_data);
	}

	public void printList()
	{
		Node temp = head;
		while (temp!=null)
		{
			System.out.print(temp.data+" "+"-->");
			temp = temp.next;
		}
	}

	public static void main(String[] args)
	{
		InsertInLinkedList llist = new InsertInLinkedList();

		llist.insertionAtHead(1);
		llist.insertionAtHead(2);
		llist.insertionAtHead(3);
		llist.insertionAtHead(4);
		llist.insertionAtHead(5);
		
		llist.insertionAtTail(8);
		llist.insertionAtTail(9);

		llist.printList();
	}
}
