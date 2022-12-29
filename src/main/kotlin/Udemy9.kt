package oo

class House(val hieght: Double , val Color: String , val Price : Int){

    fun print(){
        println("House[ hieght $hieght , Color $Color  , Price $Price]")
    }

}
fun main(args: Array<String>){
    val house= House(hieght = 4.5 , Color = "Blue" , Price = 400000)
    val redhouse = House(hieght = 5.0 , Price = 500000 , Color = "Red")

    house.print()
    redhouse.print()
}

