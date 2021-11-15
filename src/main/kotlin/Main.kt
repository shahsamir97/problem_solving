//tow sum problem
fun main(args: Array<String>) {
   val arr: IntArray = intArrayOf(3,2,4)
    print(twoSum(arr, 6))
}

fun twoSum(nums: IntArray, target: Int): IntArray? {
    val hashMap:HashMap<Int,Int> = HashMap<Int,Int>()
    var  index1  = 0
    var index2 = 0;
    hashMap.put(nums[0], 0)
    for ((index, value) in  nums.withIndex()) {
        if(index > 0) {
            if(hashMap.containsKey(target - value)){
                index1 = hashMap.get(target - value)!!
                index2 = index
                return intArrayOf( index1, index2)
            }
            hashMap.put(value, index)
        }
    }
    return null
}