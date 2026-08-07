fun main() {
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
    
    println("Pick a random number, let's see what i prepared for you: ")
    var choice = readLine()!!.toInt()   //github uses outdated kotlin stability so i had to use this old syntax...i didnt use try chat and range validator

    when (choice) {
        1 -> println("Why 1? Out of many number, you chose 1")
        in 2..10 -> println("really? Out of many numbers, you chose this small value")
        in 11..18 -> println("really? teenage?")
        else -> println("Thanks for trying my program!")
    }

    print("")

    for (i in 1..10){
        print("${i} ")
    }
    println();

    var c = 0;

    while (c <= 5) {
        print("This is a while loop ${c} ")
        c++;
    }
    println();

    do {
        println("This is a do-while Loop");
        c--;
    } while (c >= 5);
    println();
}