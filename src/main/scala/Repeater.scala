import scala.annotation.tailrec

object Repeater {
  implicit class IntTimes(val x: Int) extends Bye { //N.B. Implicit classes only take one constructor param
    //def times [A](f: => A): Unit = { //high order function, think A here is like a generic, so times takes a function with no arguments and outputs anything
    def times [A](f: Int => A): Unit = { //whereas this expects one Int parameter to be passed
      @tailrec
      def loop(current: Int): Unit = { //nested function (loop by recursion demonstrates use nicely)
        if(current > 0) {
          //f
          f(current) //call function f
          loop(current - 1)
        }
      }
      loop(x)
    }
  }
}
