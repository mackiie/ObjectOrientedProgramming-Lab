package dot.questionmark;


public class Main
{
    Node head;

    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    public static Main insert(Main list, int data)
    {
        Node newNode = new Node(data);
        newNode.next = null;

        if(list.head == null)
        {
            list.head = newNode;
        }
        else
        {
            Node last = list.head;
            while (last.next != null)
            {
                last = last.next;
            }
            last.next = newNode;
        }

        return list;
    }

    public static Main deleteByKey(Main list, int key)
    {
        Node currentNode = list.head;
        Node previousNode = null;

        if(currentNode != null && currentNode.data == key)
        {
            list.head = currentNode.next;
            System.out.println(key + " found and deleted.");
            return list;
        }

        while (currentNode != null && currentNode.data != key)
        {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode != null)
        {
            previousNode.next = currentNode.next;
            System.out.println(key + " found and deleted.");
        }

        if (currentNode == null)
        {
            System.out.println(key + " not found.");
        }

        return list;
    }

    public static Main deleteFromLast(Main list)
    {
        Node currentNode = list.head;
        Node previousNode = null;

        if (currentNode == null)
        {
            System.out.println("Linked list is empty.");
        }
        else
        {
            while (currentNode.next != null)
            {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            previousNode.next = null;
        }

        return list;
    }

    public static void printList(Main list)
    {
        Node currentNode = list.head;
        System.out.print("Linked List : ");

        while (currentNode != null)
        {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        Main linkedList = new Main();

        //linkedList = deleteFromLast(linkedList);

        linkedList = insert(linkedList, 1);
        linkedList = insert(linkedList, 2);
        linkedList = insert(linkedList, 3);
        linkedList = insert(linkedList, 4);
        linkedList = insert(linkedList, 5);
        linkedList = insert(linkedList, 6);
        linkedList = insert(linkedList, 7);
        linkedList = insert(linkedList, 8);
        linkedList = insert(linkedList, 9);
        linkedList = insert(linkedList, 10);

        printList(linkedList);

        deleteByKey(linkedList, 3);
        deleteByKey(linkedList, 7);

        linkedList = deleteFromLast(linkedList);
        linkedList = deleteFromLast(linkedList);

        printList(linkedList);
    }
}
