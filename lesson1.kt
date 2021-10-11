fun main(args: Array<String>){
    val list1 = listOf<Int>(1, 2, 4, 6)
    var list2 = listOf<Int>(3, 4, 5, 7)
    println(merge(list1, list2))
    println(merge(arrayOf(13,4,1), arrayOf(4,0,2)))

}
fun merge(list1: List<Int>, list2: List<Int>): List<Int>{
    var resultList = mutableListOf<Int>()
    resultList.addAll(list1)
    resultList.addAll(list2)
    resultList.sort()
    return resultList
}
fun merge(arr1: Array<Int>, arr2: Array<Int>): List<Int>{
    var resultList = mutableListOf<Int>()
    resultList.addAll(arr1)
    resultList.addAll(arr2)
    resultList.sort()
    return resultList
}