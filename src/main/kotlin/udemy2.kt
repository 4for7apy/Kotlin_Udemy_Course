import java.util.Random

/*
fun main(args: Array<String>) {
    val age: Int = 21
    if (age < 18){
        println("You cannot Register")
    }
    else if (age == 20){
        println("You are good student")
    }
    else{
        println("You are idiot")
    }


}
 */
/*
fun main(args: Array<String>) {
    val mode: Int = 4

    when(mode){
        1 -> println("Child")
        2 -> {
            println("Ladka")
            println("Busy Boy")
        }
        3 -> println("Old Boy")
        else -> println("Pagal ho tum")

    }

}

 */
/*
fun main(args: Array<String>) {
    val mode: Int = 5

    val result = when(mode){
        1 -> "Child"
        2 -> {
            "Busy Boy"
        }
        3 -> "Old Boy"
        else -> "ho tum bro ≧◉◡◉≦"

    }

    val chutiya: Int = 5
    val Ladki = when(chutiya){
        1 -> "Deepika Patukor"
        2 -> "Dropti murmu"
        3 ->{
            "Kalpana chalwa"
        }
        else -> "Apj abdul kalam"
    }
    println(Ladki)
    println(result)


}

 */
/*
fun main(args: Array<String>){

    val x = 8
    when(x) {
        5 -> println("x is 5")
        3*12 -> println("x is 3*12")
        "Hey There".length -> println("x is the length of the string 'Hey there' ")
        "Hey Arpi".length -> println("x is the length of the Arpit 'Hey there' ")
        in 1..10 -> println("x is between 1 to 10")
        in 11..20 -> println("")
        in 21..30 -> println()
        !in 1..9 -> println("x is not between 1 to 9")
    }
}

 */
fun main(args: Array<String>){

    val random = Random().nextInt(50) + 1
    when(random) {
        in 1..10 -> println("From 1 to 10 the no we got is : $random")
        in 11..20 -> println("From 11 to 20 the no we got is : $random")
        in 21..30 -> println("From 21 to 30 the noo we got is : $random")
        in 31..40 -> println("From 31 to 40 the no we got is : $random")
        else -> println("Over 40 the no we got is: $random")

    }
}