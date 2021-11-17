fun main(){
    val string = arrayOf("cir","car")//("flower","blow","clight",)
  println(longestCommonPrefix(string))
}
// LongestCommonPrefix
fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.size == 1) return strs[0]
    var prefix = ""
   for(i in 1 until strs.size){
       if (i == 1)
           prefix = strs[0]
       var temp = ""
       var len = strs[i].length
       if (prefix.length < strs[i].length)
           len = prefix.length
     for (j in 0 until len){
         if (prefix[j] == strs[i][j]) {
             temp += prefix[j]
         }else
             break
     }
       prefix = temp
   }
    return prefix
}