package leetcode.daily

fun sortArrayByParity(nums: IntArray): IntArray {
    if (nums.isEmpty() || nums.size == 1){
        return nums
    }
    var evenIndex = 0
    var oddIndex = nums.lastIndex
    val result = nums.clone()

    for((i, number) in nums.withIndex()){
        if(number % 2 == 0){
            result[evenIndex] = number
            evenIndex++
        }else{
            result[oddIndex] = number
            oddIndex--
        }
    }
    return result
}

fun main() {
    test(
        name = "Example 1",
        input = intArrayOf(3,1,2,4),
        expected = intArrayOf(2,4,1,3)
    )

    test(
        name = "Example 2. Empty array",
        input = intArrayOf(),
        expected = intArrayOf()
    )

    test(
        name = "Example 3. Array with 1 element",
        input = intArrayOf(1),
        expected = intArrayOf(1)
    )

    test(
        name = "Example 4. Array with even elements",
        input = intArrayOf(2,4),
        expected = intArrayOf(2,4)
    )

    test(
        name = "Example 5. Array with odd elements",
        input = intArrayOf(1,3),
        expected = intArrayOf(3,1)
    )

    test(
        name = "Example 6",
        input = intArrayOf(1,3,2,4),
        expected = intArrayOf(2,4,3,1)
    )
}

private fun test(
    name: String = "",
    input: IntArray,
    expected: IntArray
){
    val actual = sortArrayByParity(input)
    println(
        """
            === $name ===
            input=${input.contentToString()}
            expected=${expected.contentToString()}
            actual=${actual.contentToString()}
        """.trimIndent()
    )
}
