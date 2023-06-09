import Repeater.IntTimes

import scala.language.postfixOps

@main def hello(): Unit = {
  //4 times printHello
  //val printer = (who: String, x: Int) => println("Hello, World! " + x) // could also do with anonymous function
  val printer = (who: String, x: Int) => println(s"Hello, $who! $x")
  val partialPrinter = printer("World", _ : Int) // partially applied function
  //val immutable, var mutable
  4 times partialPrinter
  1 sayBye
}

  def printHello(x: Int): Unit =
    println("Hello, World! " + x)