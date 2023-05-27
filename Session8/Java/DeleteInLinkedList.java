class DeleteInLinkedList
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

		Node new_Node = new Node(data);
		new_Node.next = head;
		head = new_Node;
	}

	public void deleteFromHead()
	{
		if(head==null)
		{
			return;
		}
		head = head.next;
	}

	public void deleteFromTail()
	{
		// TODO : delete a node when linkedlist lenth is 0 or 1
		Node prev = null;
		Node temp = head;

		while(temp.next!=null)
		{
			prev = temp;
			temp = temp.next;
		}

		prev.next = null;
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
		DeleteInLinkedList llist = new DeleteInLinkedList();

		llist.insertionAtHead(1);
		llist.insertionAtHead(2);
		llist.insertionAtHead(3);
		llist.insertionAtHead(4);
		llist.insertionAtHead(5);

		llist.deleteFromHead();
		llist.deleteFromTail();
		llist.deleteFromTail();

		llist.printList();
	}
}
