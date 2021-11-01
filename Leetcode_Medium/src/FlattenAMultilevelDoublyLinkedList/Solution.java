package FlattenAMultilevelDoublyLinkedList;

import java.util.Stack;

class Node {
    public int val;
    public Node(int val) {
		super();
		this.val = val;
	}
	public Node(int val, Node prev, Node next, Node child) {
		super();
		this.val = val;
		this.prev = prev;
		this.next = next;
		this.child = child;
	}
	public Node prev;
    public Node next;
    public Node child;
};

//
class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        Stack<Node> queue = new Stack<>();
        queue.push(head);
        Node result = new Node(0, null, head, null);
        Node curr = result;
        while (!queue.isEmpty()) {
            Node child = queue.pop();
            
            Node newNode = new Node(child.val);
            curr.next = newNode;
            newNode.prev = curr;
            curr = curr.next;
            
            if (child.next != null) {
                queue.push(child.next);
            }
            if (child.child != null) {
                queue.push(child.child);
                child.child = null;
            }
        }
        result.next.prev = null;
        return result.next;
    }
}
