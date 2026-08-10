fun main(){

    val madMom = {word: String -> word.toUpperCase() + "!"}
    
    print("Please enter your mom's favorite line: ")
    val scream = madMom(readLine()?: "")

    println(scream)

    val notMadMom = {wordie: String -> wordie.toLowerCase() + " :)"}

    val notScream = notMadMom(scream)

    println(notScream)
}