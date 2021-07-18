package ReverseNodesink_Group;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {
	public ListNode reverseKGroup(ListNode head, int k) {
		// corner case;
		if (head == null || head.next == null)
			return head;

		int i = 0;
		ListNode cur = head;
		while (i < k && cur != null) {
			cur = cur.next;
			i++;
		}
		if (i < k)
			return head;

		ListNode newHead = reverseKGroup(cur, k);
		ListNode temp = head;

		for (int j = 0; j < k; j++) {
			ListNode next = temp.next;
			temp.next = newHead;
			newHead = temp;
			temp = next;
		}
		return newHead;
	}
}
