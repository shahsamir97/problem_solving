fun main(){
  print(isPalindrome(10))
}
//Palindrome Number
fun isPalindrome(x: Int): Boolean {
  val arr = x.toString()
    var low = 0;
    var high = arr.length -1
   while (high > low){
       if (arr[high] != arr[low])
           return false
       high--
       low++
   }
    return true
}