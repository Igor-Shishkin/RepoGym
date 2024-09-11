package org.kotlin.training.leetCode

fun main() {
    val node1 = ListNode(1)
    val node2 = ListNode(3)
    val node3 = ListNode(4)
    val node4 = ListNode(6)
    val node5 = ListNode(7)

    node1.next = node2
    node2.next = node3

    node4.next = node5


    val addTwoNumbers = AddTwoNumbers()
    val resultNode = addTwoNumbers.addTwoNumbers(node1, node4)
    var currentNode = resultNode
    while (currentNode != null) {
        println(currentNode.value)
        currentNode = currentNode.next
    }

}



class AddTwoNumbers {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val numStrOne = listNodesToString(l1)
        val numStrTwo = listNodesToString(l2)

        val result = (numStrOne.toInt() + numStrTwo.toInt()).toString()

        val resultHead = ListNode(0)
        var currentResultNode = resultHead

        for (c in result) {
            currentResultNode.next = ListNode(c.digitToInt())
            currentResultNode = currentResultNode.next!!
        }

        return resultHead.next
    }

    private fun listNodesToString(node: ListNode?):String {
        var result = ""
        var currentNode = node
        while(currentNode != null) {
            result = currentNode.value.toString() + result
            currentNode = currentNode.next
        }
        return result
    }
}

class ListNode(var value: Int) {
    var next: ListNode? = null
}