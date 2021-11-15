fun main(){
    var input = "MCMXCIVII"  // 10 + 11 + (11-n[i]+5-1)
    print(romanToInt(input))
}

//Problem Title :
fun romanToInt(s: String): Int {
    val hashMap: HashMap<Char, Int> = HashMap()
    hashMap.put('I', 1)
    hashMap.put('V', 5)
    hashMap.put('X', 10)
    hashMap.put('L', 50)
    hashMap.put('C', 100)
    hashMap.put('D', 500)
    hashMap.put('M', 1000)

    var arr = s.toCharArray()
    var sum = 0

    for (i in arr.indices){
         if (i == 0)
             sum += hashMap.get(arr[i])!!
        else if(hashMap.get(arr[i])!! <= hashMap.get(arr[i -1])!!)
            sum += hashMap.get(arr[i])!!
        else if (hashMap.get(arr[i])!! > hashMap.get(arr[i-1])!!)
            sum = (sum - hashMap.get(arr[i-1])!!) + (hashMap.get(arr[i])!! - hashMap.get(arr[i-1])!!)
    }
    return sum
}