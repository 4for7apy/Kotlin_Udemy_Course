/*
fun main(args: Array<String>) {
    val array = arrayOf("Bhoot","Pagal","Chor")
    println(array)

    val list = listOf("Bhoot","Pagal","Chor")
    println(list)

    val arrayList = arrayListOf("Bhoot","Pagal","Chor")
    arrayList.add("Kutta")
    println(arrayList)
}
*/
/*
fun main(args: Array<String>) {
    val array = arrayOf("Siddharth nagar","Gorakhpur","Lucknow")
    val mixed = arrayOf("Siddharth nagar",10,15,5.0)
    val numbers = intArrayOf(1,23,56)
    //println(mixed[0])
    mixed[1] = 10.50
    //println(mixed[1])

    val north_states = arrayOf("Uttar Pradesh","Uttarakhand","Punjab")
    val south_states = arrayOf("Tamilnadu","Kerala","Karnataka")
    val allstates = north_states + south_states
    println(allstates.size)

}

 */

fun main(args: Array<String>) {
    val states = arrayOf("Uttar Pradesh","uttarakhand","Punjab")
    if (states.contains("Punjab")){
        println("Yes this is a north states")}
    else {
        println("It is not a north state")
    }
    val city = arrayListOf("siddharth nagar" , "gorakhpur" , "lucknow" )
    println(city.subList(0,2))
}
