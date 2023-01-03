//Interface classes are mixture of both classes abstract classes and concarret classes (normal classes)
interface bhoot {

    fun graphic()

    fun print(){
        println("There is a bhoot")

    }
}

class Big : bhoot{
    override fun graphic() {
        println("HELLO! I AM A BHOOT")
    }
}
fun main(args: Array<String>){
    var ob1 = Big()
    ob1.graphic()
    ob1.print()

}