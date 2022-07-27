fun main(){
    println(strStr("helo", "ll"))
}

fun strStr(haystack: String, needle: String): Int {
    if(needle.isEmpty()) return 0
    val temp :Sequence<Int> = Regex(needle).findAll(haystack).map { it.range.start }

    println(temp)
    return 1
}