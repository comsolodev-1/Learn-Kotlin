interface Speaker {
    fun speak()
}

data class Person(
    var name: String,
    val age: Int,
    val gender: String
) : Speaker {
    
    override fun speak() {
        println("Hello, World...I'm ${name}")
    }
}

fun main() {
    val person1 = Person(
        name = "Dev",
        age = 19,
        gender = "male"
    )

    val person2 = person1.copy()

    person1.name = "R"

    println("is the two person the same person: ${person1 == person2}")
    println("is their age the same: ${person1.age == person2.age}")
    println("is their gender the same: ${person1.gender == person2.gender}")
    println("Person 1 is ${person1.name} while Person 2 is ${person2.name} \n")

    person1.speak() 
    person2.speak()
}