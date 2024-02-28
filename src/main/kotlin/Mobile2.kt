fun main(args: Array<String>)
{
    var fn:(Int, Int) -> Int ={num1, num2->num1 * num2};
    epicFunction(5,9,fn);
}
fun epicFunction (num1: Int, num2: Int, fn:(Int, Int) -> Int ): Unit
{
var result = fn(num1, num2);
    println(result)
}
