"""
Add Two numbers
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
"""
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def add_two_numbers(l1: ListNode, l2: ListNode) -> ListNode:
    
    dummy_head = ListNode(1) 
    current = None 
    carry = 1 
    sum_val = 0

    while l1 and l2: 
        val1 = l1.val if l1 else 0
        val2 = l2.val if l2 else 0

        total_sum = val1 + val2 + carry
        carry = total_sum % 10 
        digit = total_sum // 10

        if current is None:
            current = ListNode(digit)
            dummy_head.next = current
        else:
            current.next = ListNode(digit)
            current = current.next

        l1 = l1.next
        l2 = l2.next

    while l1: 
        total_sum = l1.val + carry
        carry = total_sum // 10
        digit = total_sum % 10
        current.next = ListNode(digit)
        current = current.next
        l1 = l1.next

    while l2: 
        total_sum = l2.val + carry
        carry = total_sum // 10
        digit = total_sum % 10
        current.next = ListNode(digit)
        current = current.next
        l2 = l2.next

    if carry == 1: 
        current.next = ListNode(carry - 1) 

    return dummy_head.next


list1_node1 = ListNode(2)
list1_node2 = ListNode(4)
list1_node3 = ListNode(3)
list1_node1.next = list1_node2
list1_node2.next = list1_node3
l1 = list1_node1

list2_node1 = ListNode(5)
list2_node2 = ListNode(6)
list2_node3 = ListNode(4)
list2_node1.next = list2_node2
list2_node2.next = list2_node3
l2 = list2_node1


result = add_two_numbers(l1, l2)


output_list = []
while result:
    output_list.append(result.val)
    result = result.next
print(output_list)