fun main(){
    val arr1 = intArrayOf(12,24,12,54,67,43)

    println("-----FizzBuzz-----")
    for (i in arr1){
        if (i % 2 == 0) {
            print(i)
            println(" isEven")
        } else {
            print(i)
            println(" isOdd")
        }
    }

}