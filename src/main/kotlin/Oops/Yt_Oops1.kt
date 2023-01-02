package Oops

class Students(){
    var name:String = "Arpit"
    var age:Int = 18

    fun pagal(){
        println("My name is $name")
        println("My age is $age")
    }


}
fun main(args: Array<String>){
    var Students1 = Students()
    Students1.name="Bhoot"
    Students1.pagal()

    var Students2 = Students()
    Students2.age = 100
    Students2.pagal()



}