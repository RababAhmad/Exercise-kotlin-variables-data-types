fun main() {

//task1
    var name: String = "Rabab"

    var age: Int = 27

    println("my name is $name and I am $age years old")
//task 2
    var score: Int = 10
    println("Initial score: $score")

    //update socre to 20 //comment

    score = 20
    println("updated score: $score")

    val greeting: String = "Hello, Kotlin!"
//task3
    val city = "New York"
    println(city)

    val temperature = 22.5
    println(temperature)

    println("The type of city is ${city.javaClass.kotlin}")
    println("The type of temperature is ${temperature.javaClass.kotlin}")


//task4


    val numString = "100"
    val numInt = numString.toInt()

    println("numInt is: $numInt")

    val numInt2 = 50
    val numString2 = numInt2.toString()
    println("numInt2 as String: $numString2")

//task 5

    val numDouble: Double = 36.5
    println("The temperature is $numDouble degrees")

    val isRaining = false
    println("is it raining $isRaining")

    val letter: Char = 'R'
    println("The first letter of my name is $letter")






}