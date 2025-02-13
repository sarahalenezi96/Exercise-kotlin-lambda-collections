fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Output:" + customFilter(nums) { it > 5 })
    println("Output:" + customFilter(nums) { it % 2 == 0 })
    println("Output:" + customFilter(nums) { it % 3 == 0 })
}

fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int> {
    return numbers.filter(filter)
}