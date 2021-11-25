object named_default  extends App{
  printIntiger(X = 6, Y = 8); //named args
  println( "Returned Value : " + addInt() )

// Defining a method
def printIntiger( X:Int, Y:Int ) =
{
  println("Value of X : " + X );
  println("Value of Y : " + Y );
}
  printIntiger(X = 6, Y = 8);


def addInt( a:Int = 5, b:Int = 7 ) : Int = { //default args
  var sum:Int = 0
  sum = a + b

  return sum
}
}
