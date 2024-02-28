import kotlin.system.exitProcess

fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//      var epicVar = "Toheeb";
//      var num1 = 5;
//      /*val num2 = 67;*/
//    var num2: Float = 5.5f;
//
//    println(epicVar);
//    println(epicVar.length);
//    println(epicVar.get(5))
//    println(epicVar.compareTo("Toheeb"))
//
//    var result = epicVar.plus(" Akinade");
//    println(result);
//    println(num2)
         /*num2 = 45;*/


//    var i = 8;
//    println(i);
//    var scores = arrayOf(1,3,5,78,3);
//    var names = arrayOf<String>("Bob", "Toheeb")
//
//    println(scores[1]);
//    println(names[1])
//
//    println(scores.get(1));
//    println(names.get(1));
//
//    scores[1] = 8;
//    println(scores[1]);
//
//    scores.set(1, 67);
//    println(scores[1])

//   var i = 9 ;
//   var x:Float = i.toFloat();
//    var epicString:String;
//    epicString = x.toString()
//    println(epicString);

//  var num1 = 55;
//  var num2 = 23;
//
//  // Addition Operator
//  println(num1 + num2);
//
//  println(num1 - num2);
//  println(num1 * num2);
//  println(num1 / num2);
//  println(num1.toFloat() / num2.toFloat());
//  println(num1 % num2);

// var num1 = 55;
// var num2 = 23;
// /* Relational Operators */
//
//    println(num1 == num2);
//    println(num1 !=num2);
//
//    println(num1 > num2);

//      // Basic Assignment Operator
//    var num1 = 55;
//
//     // Addition Assignment Operator
//    num1 *=5;   // num1 = num1 + 5;
//    num1 *=5;
//    num1 /=5;
//    num1 %=5;
//    println(num1)


//    var num1 = 45;
//     /*Unary Operators*/
//
//    // Unary Plus
//    println(+num1);
//
//    // Unary Minus
//    println(-num1)
//
//    // Pre Increment
//    println(++num1); // num1 = num1 + 1;
//    println(--num1)
//    // Post Increment
//    println(num1++);
//    println(num1);
//    println(--num1);
//
//    var epicValue = true;
//    println(!epicValue);



    /*Bitwise Operators*/
//    // 128  64  32  16  8  4  2  1
//    //  0   1   0    1  0  1  0  0
//    var x =84;
//    var y = 64;
//
//    // Shift Left....
//    // 128  64  32  16  8  4  2  1
//    //  1   0   1    0  1  0  0  0
//    println("Shift Left...."+x.shl(1));  // 168
//
//    // Shift Right...
//    // 128  64  32  16  8  4  2  1
//    //  0   0   1    0  1  0  1  0
//     println("Shift Right...."+x.shr(1));  // 42
//
//    var num1 = 78;
//    var num2 = 118;
//
//    // Bitwise OR
//    // 128  64  32  16  8  4  2  1
//    //  0   1   0    0  1  1  1  0 - 78
//    //  0   1   1    1  0  1  1  0 - 118
//    //  --------------------------
//    //  0   1   0    0  0  1  1  0  - 70 And  - 0 supersede 1
//    //  0   1   1    1  1  1  1  0  - 126 Or  - 1 supersede 0
//    println("Bitwise OR..."+num1.or(num2));  // 126
//    println("Bitwise And..."+num1.and(num2)); // 70
//
//    // Bitwise XOR  (exclusive or)
//    // 128  64  32  16  8  4  2  1
//    //  0   1   0    0  1  1  1  0 - 78
//    //  0   1   1    1  0  1  1  0 - 118
//    //  --------------------------
//    //  0   0   1    1  1  0  0  0  - 56  - subtract num1-num2
//   println("Bitwise XOR(exclusive or)..."+num1.xor(num2)); // 56
//
//
//
//
//    // Bitwise Inverse
//    // 128  64  32  16  8  4  2  1
//    //  0   1   0    0  1  1  1  0 - 78
//    //  --------------------------
//    //
//    //  1   0   1    1  0  0  0  1  - -79
//    println("Bitwise Inverse..."+num1.inv())

    /*Logical Operators*/

//    var num1 = 55;
//    var num2 = 23;
//    println("Logical Operation..."+(num1 > num2 && num1 !=55));
//    println("Logical Operation..."+(num1 > num2 && num1 !=55));
//
//    var variable = num1

//print("World");
//print("World");
//print("World");
//println("Hello");
//println("Hello");
//println("Hello");
//
//    var data: Int = Integer.valueOf(readLine());
//    println("Input & Output..."+(data*2));


//   /*when*/

//    var x =45;
//    when (x)
//    {
//        10 -> println("10");
//        in 40..49 -> println("40-49");
//        30 -> println("30");
//        40 -> println("40");
//        50 ->
//        {
//            println("50");
//            println();
//        }
//    }

//   var epicVar = when (x)
//    {
//        10, 20, 30 -> "10, 20 or 30";
//        in 40..49 -> "40 to 49";
//        50 ->
//        {
//            println("50");
//            println("Everything is awesome");
//            "50";
//        }
//
//
//       else -> "Default"
//
//   }
//    println(epicVar);

//var number = Addition(4,5);
//println(number);
//println(number*number);



//*   Recursion: Its when a function calls itself
   /*countUp(0,10);*/

//* Default and named arguments

add();
    epicFunction(number =65);
}
//fun Addition(num1: Int, num2: Int): Int {
//    val result = num1 + num2;
//    return result;

/*fun countUp(startingNumber:Int, number: Int)
{
    println(startingNumber)
    val nextNumber = startingNumber + 1;

   if (startingNumber < number) {
       countUp(nextNumber, number);
   }*/


//**
fun add(num1: Int = 1, num2: Int = 2)
{
    println(num1 + num2);
}
fun epicFunction(letter: Char ='a', number: Int=9)
{
    println("$letter and $number");
}



