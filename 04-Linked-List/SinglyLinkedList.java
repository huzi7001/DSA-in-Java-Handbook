/**
 * Singly Linked List
 *
 * Operations:
 * - Insertion at End
 * - Traversal
 * - Searching
 *
 * Time Complexity:
 * Traversal : O(n)
 * Search    : O(n)
 * Insertion : O(n)
 */

public class SinglyLinkedList {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at end
    public void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Traverse
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Search
    public boolean search(int key) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Linked List:");
        list.display();

        int key = 30;

        if (list.search(key)) {
            System.out.println(key + " found.");
        } else {
            System.out.println(key + " not found.");
        }
    }
}
