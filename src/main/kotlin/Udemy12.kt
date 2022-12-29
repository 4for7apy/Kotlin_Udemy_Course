package oo

abstract class Course(val topic: String , val price: Double){
    open fun learn(){
        println("Learning a $topic course.")
    }
}

class Kotlincourse(): Course("Kotlin" , 999.99){
    override fun learn(){
        println("i am bhoot")
    }
}
fun main(args: Array<String>){
    val course = Kotlincourse()
    course.learn()
}
