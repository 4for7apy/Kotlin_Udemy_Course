fun main(){
    /*
    var set = setOf<Int>(10,20,30,40)

    println(set)

    var set1 = mutableSetOf<Int>(9,30,40,50)
    println(set1)
    set1.add(60)
    println(set1)
    for (e in set1)
        if (e%2==0)
            println("bhoot")
    */

    var map1 = hashMapOf<String,Int>("Arpit" to 23 , "Anil" to 7)
    println(map1)
    var age = map1.get("Anil")
    println(age)
    println(map1.size)


}

