fun main() {
    val person1 = Person(
        name = "soloDev",
        age = 19,
        gender = "male"
    )

    val person2 = person1.copy()

    person1.name = "Reyny"

    println("is the two person the same person: ${person1 == person2}")
    println("is their age the same: ${person1.age == person2.age}")
    println("is their gender the same: ${person1.gender == person2.gender}")
    println("Person 1 is ${person1.name} while Person 2 is ${person2.name}")
}

data class Person(
    var name: String,
    val age: Int,
    val gender: String
)