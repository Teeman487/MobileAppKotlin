import java.lang.Exception

fun main(args: Array<String>) {
 var num1 = 100;
 val num2 = 0;

    try {
        val result = num1/num2;
        println(result)
    } catch (error: Exception)
    {
        println(error);
    }
    println("After the check")




}