package leetcode.daily

fun heightChecker(heights: IntArray): Int {
    val expected = heights.sorted()
    var mismatchCount = 0
    for(i in heights.indices){
        if(heights[i] != expected[i]){
            mismatchCount++
        }
    }
    return mismatchCount
}

fun main() {
    test(intArrayOf(1,1,4,2,1,3), expectedCount = 3)
    test(intArrayOf(5,1,2,3,4), expectedCount = 5)
    test(intArrayOf(1,2,3,4,5), expectedCount = 0)
    test(intArrayOf(), expectedCount = 0)
    test(intArrayOf(1,1,1), expectedCount = 0)
}

private fun test(
    heights: IntArray,
    expectedCount: Int
){
    val result = heightChecker(heights)
    println(
        """
            ======
            heights: ${heights.contentToString()}
            expectedCount: $expectedCount
            actualCount: $result
        """.trimIndent()
    )
}
