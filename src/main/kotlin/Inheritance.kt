//PARENT CLASS
//SUPER CLASS
open class Person
{
    var id:Int = 2505
    open fun display(){
        println("My id is $id")
    }
}
//CHILD CLASS
//SUB CLASS
class Son(var name: String):Person(){
    fun displaymodified(){
        println("My name is $name and my id is $id")
    }
    override fun display(){
        println("My new id no is $id")
    }

}
fun main(args: Array<String>){
    var obj1 = Son("Arpit")
    obj1.display()
    obj1.displaymodified()
    obj1.display()


}