package maybep

import scala.util.Random

sealed trait Maybe[+T]
case class Some[T](o: T) extends Maybe[T]
case object None extends Maybe[Nothing]

sealed trait Binary
case object Zero extends Binary
case object One extends Binary

object sFunc {
  def lawfulEvilFunction(): Maybe[Binary] = {
    Random.nextInt(3) match {
      case 0 => Some(Zero)
      case 1 => Some(One)
      case _ => None
    }
  }

  def printBinary(b: Binary) : Unit = {
    b match {
      case One => println("One")
      case Zero => println("Zero")
    }
  }
}

object MaybeMain extends App {
  sFunc.lawfulEvilFunction() match {
    case Some(x) => sFunc.printBinary(x)
    case None => println("Cant call printBinary on None")
  }
}
