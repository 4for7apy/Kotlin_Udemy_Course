
//Constructor
class Students(var name: String , var age: Int){
    fun paste(){
        println("Name of the animal is '$name' , Age of the animal is '$age'")
    }

}
fun main(args: Array<String>){
    var students1 = Students("Arpit" , 18)
    students1.paste()
    var students2 = Students("Arpita" , 15)
    students2.paste()
    var students3 = Students("Anil" , 18)
    students3.paste()
    var students4 = Students("Bhoot" , 20)
    students4.paste()


}