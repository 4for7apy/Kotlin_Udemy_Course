import java.lang.Exception
import java.util.InputMismatchException
import java.util.Scanner

fun main(args: Array<String>){
    var ob=Scanner(System.`in`)
    try {
        var a = ob.nextInt()
        var b = ob.nextInt()

        var c = a/b

        println(c)
    }catch (e : ArithmeticException){
        println("Exception Occured ${e.message}")
    }
    catch (e : InputMismatchException){
        println("Invalid Input ${e.message}")
    }
    catch (e:Exception){
        println("Excetion Solved ${e.message}")
    }
    finally {
        println("Thanks bro")
    }

    println("Program Ended")

}