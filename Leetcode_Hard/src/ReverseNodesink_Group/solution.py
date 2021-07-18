
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseKGroup(self, head: ListNode, k: int) -> ListNode:
        nextGroupHead, nodeNum = head, 0
        while nextGroupHead != None and nodeNum < k:
            nextGroupHead = nextGroupHead.next
            nodeNum += 1
        
        if nodeNum == k:
            # TODO: have completed the later part
            nextGroupHead = Solution.reverseKGroup(self, nextGroupHead, k)
            curTailNext = nextGroupHead
            for i in range(k):
                nextNode = head.next
                head.next = curTailNext
                curTailNext = head
                head = nextNode
            head = curTailNext
        return head;