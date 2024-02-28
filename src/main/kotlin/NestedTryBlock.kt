import java.lang.ArithmeticException

fun main(args: Array<String>) {
  var array1 = intArrayOf(1,2,3,4,5,6,7,8);
  var array2 = intArrayOf(1,0,5,3,4);
  try {
      for(item in array1.indices) // item - 0,1,2,3,4,5,6,7
      {
          try {
              println(array1[item].toString() + "/" + array2[item] + " = " + array1[item] / array2[item]);
          }
          catch (error: ArithmeticException)
          {
              println("Please no division by zero")
          }
      }

  }
  catch (error: ArrayIndexOutOfBoundsException)
  {

  }
}