open class Person
{
    var id:Int = 2505
    fun display(){
        println("My id is $id")
    }
}
class Son:Person(){

}
fun main(args: Array<String>){
    var obj1 = Son()
    obj1.display()

}