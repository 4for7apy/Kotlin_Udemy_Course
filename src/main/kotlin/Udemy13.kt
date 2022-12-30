package oo

import java.awt.print.Book

class book(val title : String , val author: String , val price: Int){

}
data class Databook(val title: String , val author: String , val price: Int){

}
fun main(args: Array<String>){
    val Book = book("IKIGAI" , "Bhhoot" ,500 )
    val databook = Databook("The Pyscology of money" , "Bhoot2" , 4000)

    println(Book)
    println(databook)
}
