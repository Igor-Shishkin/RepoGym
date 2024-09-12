package org.kotlin.training.leetCode

class MergeKSortedList {
}
fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    val numbers = ArrayList<Int>(lists.size * 30)
    var currentNode: ListNode?
    for (i in lists) {
         currentNode = i
        while (currentNode != null) {
            numbers.add(currentNode.value)
            currentNode = currentNode.next
        }
    }

    val head = ListNode(0)
    currentNode = head
    for (i in numbers.sorted()) {
        currentNode?.next = ListNode(i)
        currentNode = currentNode?.next
    }
    return head.next
}

fun main() {
    val l1 = createListNode(1233)
    val l2 = createListNode(1115)
    val mergeKLists = mergeKLists(listOf(l1, l2).toTypedArray())

    var currentNode = mergeKLists
    while (currentNode != null) {
        println(currentNode.value)
        currentNode = currentNode.next
    }
}

