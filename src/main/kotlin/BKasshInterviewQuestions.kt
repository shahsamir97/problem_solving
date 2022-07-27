fun main() {
    printSequence()
}


//print the sequence 10...1...10
fun printSequence() {
    var i = 10
    var isFirstIteration = true

    while (i >= 1) {
        if (isFirstIteration) {
            println(i)
            if (i == 1) {
                isFirstIteration = false
            }else{
                i--
            }
        }else {
            i++
            if (i > 10) break
            println(i)
        }
    }
}