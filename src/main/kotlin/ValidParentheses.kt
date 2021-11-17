fun main() {
    println(isValid("(("))
}

fun isValid(s: String): Boolean {
    if (s.length == 1) return false
    val hashMap = HashMap<Char, Char>()
    hashMap.put('(',')')
    hashMap.put('{', '}')
    hashMap.put('[',']')
    val stack = arrayListOf<Char>()
    for (i in s.indices){
        if (s[i] =='('|| s[i] == '{' || s[i]=='['){
            stack.add(s[i])
        }else if(stack.size == 0){
            stack.clear()
            hashMap.clear()
            return false
        }
        else {
            if (hashMap.get(stack.last()) == s[i]) {
                stack.removeAt(stack.size - 1)
            }
            else {
                stack.clear()
                hashMap.clear()
                return false
            }
        }
    }
    var result = stack.size == 0
    stack.clear()
    hashMap.clear()
    return result
}
