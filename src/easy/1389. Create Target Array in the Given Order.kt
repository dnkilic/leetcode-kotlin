package easy

fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
    val list = IntArray(nums.size).toMutableList()

    for (i in index.indices) {
        list.add(index[i], nums[i])
    }

    return list.take(nums.size).toIntArray()
}