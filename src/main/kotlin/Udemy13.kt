package oo

import java.awt.print.Book

class book(val title : String , val author: String , val price: Int){
    override fun toString(): String {
        return ("Book = $title , author = $author , price = $price")
    }

}
data class Databook(val title: String , val author: String , val price: Int){

}
fun main(args: Array<String>){
    val Book = book("IKIGAI" , "Bhhoot" ,500 )
    val databook = Databook("The Pyscology of money" , "Bhoot2" , 4000)
    val Book2 = book("Rich dad poor dad" , "Bhoot3" , 1500)


    println(Book)
    println(databook)
    println(Book2)
}
