import kotlin.system.exitProcess

class Menu{
    private var choice = 0

    val lines = "------------------------------"
    val strCalc = "Calculator"
    val strAdvCalc = "Advance Calculator"
    val strNotCalc = "Definitely not a Calculator"
    val strQuit = "Exit"

    private val calculator = Calculator()
    private val advCalculator = AdvanceCalulator()
    private val defNotCalc = DefNotCalc()

    fun displayMenu(){
        while(choice != 4) {
            println("${lines} \nI don't know what to call this. $$$ \n ${lines}")
            println("1. ${strCalc} \n2. ${strAdvCalc} \n3. ${strNotCalc} \n4. ${strQuit} \n ${lines}")

            print("Please Enter Your Choice: ")
            choice = readLine()?.toIntOrNull()?: 0

            when (choice) {
                1 -> calculator.displayMsg(this)
                2 -> advCalculator.displayChoice(this)
                3 -> defNotCalc.displayOption(this)
                4 -> {println("Your choice is ${strQuit}"); exitProcess(0)}
                else -> println("Nah, why?? The choices are obvious!");
            }
        }
    }
}

class Calculator{

    val opAdd = "Addition"
    val opSub = "Subtraction"
    val opMul = "Multiplication"
    val opDiv = "Division"
    val opMod = "Modulo"
    val mainMenu = "Go back to main Menu"

    fun displayMsg(menu: Menu){
        var calcChoice = 0
        
        while(calcChoice !in 6..7) {
            println("${menu.lines} \nYou chose ${menu.strCalc} \n${menu.lines} \nChoose Operation Below: \n${menu.lines}");
            println("1. ${opAdd} \n2. ${opSub} \n3. ${opMul} \n4. ${opDiv} \n5. ${opMod} \n6. ${mainMenu} \n7. ${menu.strQuit} \n${menu.lines}")

            print("Please Enter Your Choice: ")
            calcChoice = readLine()?.toIntOrNull()?: 0

            when (calcChoice) {
                1 -> println();
                2 -> println();
                3 -> println();
                4 -> println();
                5 -> println();
                6 -> return
                7 -> {println("Your choice is ${menu.strQuit}"); exitProcess(0)}
                else -> println("Nah, why?? The choices are obvious!");
            }
        }
    }
}

class AdvanceCalulator{

    val opFact = "Factorial"
    val opSqr = "Square"
    val mainMenu = "Go back to main Menu"

    fun displayChoice(menu: Menu){
        var advChoice = 0;

        while(advChoice !in 3..4) {
            println("${menu.lines} \nYou chose ${menu.strAdvCalc} \n${menu.lines} \nChoose Operation Below")
            println("${menu.lines} \n1. ${opFact} \n2. ${opSqr} \n3. ${mainMenu} \n4. ${menu.strQuit} \n${menu.lines}");
        
            print("Enter your choice: ")
            advChoice = readLine()?.toIntOrNull()?: 0
            
            when (advChoice){
                1 -> println()
                2 -> println()
                3 -> return
                4 -> {println("Your choice is ${menu.strQuit}"); exitProcess(0)}
                else -> println("Nah, why?? The choices are obvious!");
            }
        }
    }
}

class DefNotCalc{

    val dogSay = "Dog says"
    val trueOrFalse = "True or False"
    val mainMenu = "Go back to main Menu"

    fun displayOption(menu: Menu){
        var notChoice = 0

        while (notChoice !in 3..4){
            println("${menu.lines} \nYou chose something that is \n${menu.strNotCalc} \n${menu.lines} \nChoose Below \n${menu.lines}")
            println("1. ${dogSay} \n2. ${trueOrFalse} \n3. ${mainMenu} \n4. ${menu.strQuit} \n${menu.lines}")

            print("Enter your choice: ")
            notChoice = readLine()?.toIntOrNull()?: 0
            
            when (notChoice){
                1 -> println()
                2 -> println()
                3 -> return
                4 -> {println("Your choice is ${menu.strQuit}"); exitProcess(0)}
                else -> println("Nah, why?? The choices are obvious!");
            }
        }
    }
}

fun main(){
    val menu = Menu()
    menu.displayMenu()
}