package leetcode.daily

fun removeElement(nums: IntArray, `val`: Int): Int {
    if (nums.isEmpty()) {
        return 0
    }
    var counter = 0
    var startIndex = 0
    var endIndex = nums.lastIndex
    while (startIndex <= endIndex) {
        if (nums[startIndex] != `val`) {
            ++startIndex
            ++counter
        } else {
            val numEnd = nums[endIndex]
            nums[endIndex] = nums[startIndex]
            nums[startIndex] = numEnd
            --endIndex
        }
    }
    return counter
}

fun main() {
    test(
        name = "Example 1",
        input = intArrayOf(3, 2, 2, 3),
        `val` = 3,
        expected = intArrayOf(2, 2, 3, 3)
    )
    test(
        name = "Example 2",
        input = intArrayOf(),
        `val` = 5,
        expected = intArrayOf()
    )
    test(
        name = "Example 3",
        input = intArrayOf(1,2,3),
        `val` = 5,
        expected = intArrayOf(1,2,3)
    )
    test(
        name = "Example 4",
        input = intArrayOf(2,2,2),
        `val` = 2,
        expected = intArrayOf(2,2,2)
    )
}

private fun test(
    name: String,
    input: IntArray,
    expected: IntArray,
    `val`: Int
) {
    val inputCopy = input.clone()
    val k = removeElement(input, `val`)
    println(
        """
           === $name ===
           input: ${inputCopy.contentToString()}
           val: $`val`
           expected: ${expected.contentToString()}
           actual: ${input.contentToString()} 
           k: $k
        """.trimIndent()
    )
}