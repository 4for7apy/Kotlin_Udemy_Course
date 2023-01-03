abstract class Dad(){
    abstract fun hi()

    fun sayParent(){
        println("Parent")
    }




}
class Small:Dad(){
    override fun hi() {
        println("This is a child")
    }
}

fun main(args: Array<String>){
    var ob1 = Small()
    ob1.hi()
    ob1.sayParent()

}