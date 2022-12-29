package function

import java.util.Date

fun max(a: Int , b: Int): Int{
    if (a>=b){
        return a
    } else{
        return b
    }
}
fun min(a:Int , b:Int): Int{
    if(a<=b){
        return a
    }else
        return b
}
fun multiply(a:Int , b:Int):Int{
    return (a*b)
}
fun addition(a: Int , b: Int):Int{
    return (a+b)
}
fun getcurrentdate(): Date{
    return Date()
}
fun main(args: Array<String>){
    println(max(100 , 50))
    println(min(100,  50))
    println(multiply(100, 50))
    println(addition(100 , 50))
    println(getcurrentdate())
    val x = listOf(2,4,6,8,10)
    println(x.reversed())
}
