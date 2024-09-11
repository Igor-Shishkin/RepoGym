package org.kotlin.training.leetCode

fun main() {
    val node1 = createListNode(9465)
    val node2 = createListNode(942)


    val addTwoNumbers = AddTwoNumbers()
    val resultNode = addTwoNumbers.addTwoNumbers(node1, node2)
    var currentNode = resultNode
    while (currentNode != null) {
        println(currentNode.value)
        currentNode = currentNode.next
    }

}



class AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val numOne = listNodesToString(l1)
        val numTwo = listNodesToString(l2)

        val result = (numOne + numTwo).toString().reversed()

        val resultHead = ListNode(0)
        var currentResultNode: ListNode? = resultHead

        for (c in result) {
            currentResultNode?.next = ListNode(c.digitToInt())
            currentResultNode = currentResultNode?.next
        }

        return resultHead.next
    }

    private fun listNodesToString(node: ListNode?): Int {
        var result = ""
        var currentNode = node
        while(currentNode != null) {
            result += currentNode.value.toString()
            currentNode = currentNode.next
        }
        return result.toInt()
    }
}

class ListNode(var value: Int) {
    var next: ListNode? = null
}

fun createListNode(num: Int): ListNode? {
    val strNumber = num.toString()
    val headNode = ListNode(0)
    var currentNode: ListNode? = headNode
    for (c in strNumber) {
        currentNode?.next = ListNode(c.digitToInt())
        currentNode = currentNode?.next
    }
    return headNode.next
}