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
        
        println("""
 _________________________
|  _____________________  |
| |         Hello World | |
| |_____________________| |
|_________________________|
|                         |
| [AC ] [ C ] [ % ] [ / ] |
|                         |
| [ 7 ] [ 8 ] [ 9 ] [ * ] |
|                         |
| [ 4 ] [ 5 ] [ 6 ] [ - ] |
|                         |
| [ 1 ] [ 2 ] [ 3 ] [ + ] |
|                         |
| [ 0 ] [00 ] [ . ] [ = ] |
|_________________________|
        """)

        while(calcChoice !in 6..7) {
            println("${menu.lines} \nYou chose ${menu.strCalc} \n${menu.lines} \nChoose Operation Below: \n${menu.lines}");
            println("1. ${opAdd} \n2. ${opSub} \n3. ${opMul} \n4. ${opDiv} \n5. ${opMod} \n6. ${mainMenu} \n7. ${menu.strQuit} \n${menu.lines}")

            print("Please Enter Your Choice: ")
            calcChoice = readLine()?.toIntOrNull()?: 0

            when (calcChoice) {
                1 -> addNum(opAdd, menu)
                2 -> subNum(opSub, menu)
                3 -> mulNum(opMul, menu)
                4 -> divNum(opDiv, menu)
                5 -> modNum(opMod, menu)
                6 -> return
                7 -> {println("Your choice is ${menu.strQuit}"); exitProcess(0)}
                else -> println("Nah, why?? The choices are obvious!");
            }
        }
    }

    fun addNum(strAdd: String, menu: Menu){
        println("${menu.lines} \nYou chose ${strAdd} \n${menu.lines}")
    
        print("Please enter the first number: ")
        var num1 = readLine()?.toIntOrNull()?: 0
        print("Please enter the second number: ")
        var num2 = readLine()?.toIntOrNull()?: 0

        val sum = num1 + num2

        println("${menu.lines} \n${num1} + ${num2} = ${sum} \n${menu.lines}")
    }

    fun subNum(strSub: String, menu: Menu){
        println("${menu.lines} \nYou chose ${strSub} \n${menu.lines}")
    
        print("Please enter the first number: ")
        var num1 = readLine()?.toIntOrNull()?: 0
        print("Please enter the second number: ")
        var num2 = readLine()?.toIntOrNull()?: 0

        val diff = num1 - num2

        println("${menu.lines} \n${num1} - ${num2} = ${diff} \n${menu.lines}")
    }

    fun mulNum(strMul: String, menu: Menu){
        println("${menu.lines} \nYou chose ${strMul} \n${menu.lines}")
    
        print("Please enter the first number: ")
        var num1 = readLine()?.toIntOrNull()?: 0
        print("Please enter the second number: ")
        var num2 = readLine()?.toIntOrNull()?: 0

        val prod = num1 * num2

        println("${menu.lines} \n${num1} * ${num2} = ${prod} \n${menu.lines}")
    }

    fun divNum(strDiv: String, menu: Menu){
        println("${menu.lines} \nYou chose ${strDiv} \n${menu.lines}")
    
        print("Please enter the first number: ")
        var num1 = readLine()?.toIntOrNull()?: 0
        print("Please enter the second number: ")
        var num2 = readLine()?.toIntOrNull()?: 0

        val quo = num1 / num2

        println("${menu.lines} \n${num1} / ${num2} = ${quo} \n${menu.lines}")
    }

    fun modNum(strMod: String, menu: Menu){
        println("${menu.lines} \nYou chose ${strMod} \n${menu.lines}")
    
        print("Please enter the first number: ")
        var num1 = readLine()?.toIntOrNull()?: 0
        print("Please enter the second number: ")
        var num2 = readLine()?.toIntOrNull()?: 0

        val rem = num1 % num2

        println("${menu.lines} \n${num1} % ${num2} = ${rem} \n${menu.lines}")
    }
}

class AdvanceCalulator{

    val opFact = "Factorial"
    val opSqr = "Exponentation"
    val mainMenu = "Go back to main Menu"

    fun displayChoice(menu: Menu){
        var advChoice = 0;

        println("""
 _________________________
|  _____________________  |
| |         Hello World | |
| |_____________________| |
|_________________________|
|                         |
|   [AC] [ C] [ ^] [ !]   |
|                         |
|   [ 7] [ 8] [ 9] |---|  |
|                  |   |  |
|   [ 4] [ 5] [ 6] | = |  |
|                  |   |  |
|   [ 1] [ 2] [ 3] |   |  |
|                  |---|  |
|   [ 0] [00] [ .]        |
|_________________________|
        """)

        while(advChoice !in 3..4) {
            println("${menu.lines} \nYou chose ${menu.strAdvCalc} \n${menu.lines} \nChoose Operation Below")
            println("${menu.lines} \n1. ${opFact} \n2. ${opSqr} \n3. ${mainMenu} \n4. ${menu.strQuit} \n${menu.lines}");
        
            print("Enter your choice: ")
            advChoice = readLine()?.toIntOrNull()?: 0
            
            when (advChoice){
                1 -> factNum(opFact, menu)
                2 -> sqrNum(opSqr, menu)
                3 -> return
                4 -> {println("Your choice is ${menu.strQuit}"); exitProcess(0)}
                else -> println("Nah, why?? The choices are obvious!");
            }
        }
    }

    fun factNum(strFact: String, menu: Menu){
        println("${menu.lines} \nYou chose ${strFact} \n${menu.lines}")
        var num = -1;
    
        while (num < 0){
            print("Please enter the number: ")
            num = readLine()?.toIntOrNull()?: -1
        }

        println("${num}! = " + solve(num) + "\n${menu.lines}")
    }

    fun solve(num: Int): Long {
        if (num <= 1) return 1L
        
        return num * solve(num - 1)
    }

    fun sqrNum(strSqr: String, menu: Menu){
        println("${menu.lines} \nYou chose ${strSqr} \n${menu.lines}")

        print("Please enter the number: ")
        var num = readLine()?.toIntOrNull()?: 0
        print("Please enter the exponent: ")
        var exp = readLine()?.toIntOrNull()?: 0

        println("${num}^${exp} = " + calc(num, exp) + "\n${menu.lines}")
    }

    fun calc(num: Int, exp: Int): Long{
        if (exp == 0) return 1L
        
        return num * calc(num, exp -1)
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
                1 -> dogSays(dogSay, menu)
                2 -> boolSheet(trueOrFalse, menu)
                3 -> return
                4 -> {println("Your choice is ${menu.strQuit}"); exitProcess(0)}
                else -> println("Nah, why?? The choices are obvious!");
            }
        }
    }

    fun dogSays(strDog: String, menu: Menu) {
        println("${menu.lines} \nYou chose ${strDog} \n${menu.lines}")
        print("Enter a word: ")
        val word = readLine()?: ""

        println(display(word,menu))
    }

    fun boolSheet(strBool: String, menu: Menu){
        println("${menu.lines} \nYou chose ${strBool} \n${menu.lines}")
        print("Enter a hypothesis: ")
        val word = readLine()?: ""

        val isTrue = kotlin.random.Random.nextBoolean().toString()

        println(display(isTrue,menu))
    }

    fun display(word: String, menu: Menu){
        val textLength = word.length
        val innerWidth = if (textLength > 11) textLength + 2 else 13
        val rightPadding = " ".repeat(innerWidth - textLength)
        val innerBorder = "_".repeat(innerWidth + 2)
        val outerBorder = "_".repeat(innerWidth + 6)

        println("""
                $outerBorder
                |  $innerBorder  |
                | | $rightPadding$word | |
                | |$innerBorder| |
                |$outerBorder|
                        \
                        \   / \__
                            (    @\___
                            /         O
                           /    (_____/
                          /____/    
                    """)
                    
        println("${menu.lines}")
    }
}

fun main(){
    val menu = Menu()
    menu.displayMenu()
}