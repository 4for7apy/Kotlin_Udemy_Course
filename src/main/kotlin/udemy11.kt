package oo
open class Friend(open var Name: String , open var Age: Int){

    fun print(){
        println("Friend1[name $Name , age $Age]")
    }

}                                                              // Inheritance is done by "OPEN" and "OVERRIDE" Function
fun main(args: Array<String>){
    var arpit = Friend(Name = "Arpit", Age = 18)
    var suraj = Friend(Name = "Suraj" , Age = 19)

    arpit.print()
    suraj.print()
}
