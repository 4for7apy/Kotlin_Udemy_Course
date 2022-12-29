package oo

class District {
    class City1 {
        var name: String = "Siddharth nagar"
        var size: Float = 4200.00F
        var origin: String = "15 Dec 2004 in kapilvastu"    // A UNKNOWN ERROR THIS CODE IS NOT RUNNING


    }

    class City2 {                                            // A UNKNOWN ERROR THIS CODE IS NOT RUNNING
        var name: String = "Gorakhpur"
        var size: Float = 8500.00F
        var origin: String = "10 Jan 2008 in ambai"     // A UNKNOWN ERROR THIS CODE IS NOT RUNNING
    }

    class City3 {
        var name: String = "Lucknow"
        var size: Float = 58000.00F
        var origin: String = "24 May 1987 in Badshahganj"
    }

    fun main(args: Array<String>) {

        val city1 = City1()
        println(city1.name)
        println(city1.size)
        val city2 = City2()
        println(city2.name)
        println(city2.size)
        val city3 = City3()                                    // A UNKNOWN ERROR THIS CODE IS NOT RUNNING
        println(city3.name)
        city3.size = 500000.0F
        println(city3.size)

    }
}