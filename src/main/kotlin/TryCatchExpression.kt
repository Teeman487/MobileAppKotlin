import java.lang.ArithmeticException
import java.lang.NumberFormatException

fun main(args: Array<String>)
{
    var string = convert("pppwpw");
    println(string);
}
fun convert(strVar: String): Int
{   return try
    {
        Integer.parseInt(strVar);
    }
    catch (error: NumberFormatException)
    {
        0;
    }

}