fun main() {
    //All my base java knowledge is applied in this code.

   val myName = "Reyny Markk X14";
   val myBday = "June 14, 2007";
   var myAge = 100;
   var favNum = 142.857;
   var isDev = true;
    
   println("My Name is ${myName}. I was born on ${myBday}. I am currently ${myAge}. My SQl is ${favNum}.")
   println("Am I a developer? The answer is a big fuck ${isDev}")
   
   var hasPortfolio = if (isDev) {
       "Yes"
   } else {
       "No"
   }
   
    var text = hasPortfolio + ", I have a portfolio";
    text = "${hasPortfolio}, I have a portfolio"; //it works the same with above but I'm testing if this kind of syntax is possible
    println(text)
    
    var choice = 0;  

    while (choice !in 1..100){
        println("Pick a random number between 1 and 100, let's see what i prepared for you: ")
        choice = readLine()?.toIntOrNull() ?: 0
    }

    when (choice) {
        1 -> println("Why 1? Out of many number, you chose 1")
        in 2..10 -> println("really? Out of many numbers, you chose this small value")
        in 11..19 -> println("really? teenage?")
        else -> println("Thanks for trying my program!")
    }
    println();

    for (i in 1..10){
        print("${i} ")
    }
    println("\n");

    var c = 0;

    while (c <= 5) {
        if (c == 3) {
            break;
        }
        println("This is a while loop ${c} ")
        c++;
    }
    println();

    do {
        if (c == 3) {
            c--;
            continue;
        }
        println("This is a do-while Loop ${c}");
        c--;
    } while (c >= 1);
    println();

    val arrOfNum = intArrayOf(12, 13, 15, 20, 50)

    for (i in arrOfNum.indices) {
        println(arrOfNum[i])
    }
}