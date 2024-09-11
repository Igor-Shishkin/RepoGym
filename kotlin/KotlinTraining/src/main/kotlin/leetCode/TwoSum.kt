package org.kotlin.training.leetCode

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for (i in nums.indices) {
        val compliment = target - nums[i]
        if (map.containsKey(compliment)) {
            return intArrayOf(map[compliment]!!, i)
        }
        map[nums[i]] = i
    }
    return intArrayOf()
}
fun main() {
    print(twoSum(intArrayOf(1,-3,5,2, 9), 7).joinToString("\t"))
}


/*
 Two Sum
Easy

Topics
Companies

Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */