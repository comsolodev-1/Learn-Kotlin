import kotlin.system.exitProcess

class Menu{
    private var choice = 0

    val lines = "------------------------------"
    val strCalc = "Calculator"
    val strAdvCalc = "Advance Calculator"
    val strNotCalc = "Definitely not a Calculator"
    val strQuit = "Exit"

    private val calculator = Calculator()

    fun displayMenu(){
        while(choice != 4) {
            println("I don't know what to call this. $$$ \n ${lines}")
            println("1. ${strCalc} \n2. ${strAdvCalc} \n3. ${strNotCalc} \n4. ${strQuit} \n ${lines}")

            println("Please Enter Your Choice: ")
            choice = readLine()?.toIntOrNull()?: 0

            when (choice) {
                1 -> calculator.displayMsg(this)
                2 -> println("Your choice is ${strAdvCalc}")
                3 -> println("Your choice is ${strNotCalc}")
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
            println("You chose ${menu.strCalc} \n${menu.lines} \nChoose Operation Below: \n${menu.lines}");
            println("1. ${opAdd} \n2. ${opSub} \n3. ${opMul} \n4. ${opDiv} \n5. ${opMod} \n6. ${mainMenu} \n7. ${menu.strQuit} \n${menu.lines}")

            println("Please Enter Your Choice: ")
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

fun main(){
    val menu = Menu()
    menu.displayMenu()
}