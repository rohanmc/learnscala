sealed trait Binary
case object One extends Binary
case object Zero extends Binary
case class Other(x:Int) extends Binary


sealed trait WrapperTrait[+T]
case class IntVal[T](x:T,y:Int) extends WrapperTrait[T]
case class StringVal[T](x:T,y:String) extends WrapperTrait[T]
case object Nop extends WrapperTrait[Nothing]
case class Wik[T]() extends WrapperTrait[T]

sealed trait List[+T]
case class Elem[T](x:T, y:List[T]) extends List[T]
case object Nil extends List[Nothing]



object Adt extends App {

  def fn(x:List[Int]): Unit = {}

  def fn2(x:List[Char]): Unit = {}

  val x:List[Int] = Elem(1, Elem(2, Elem(3, Nil)))
  val y:List[Int] = Nil
  val z:List[Int] = Elem(1, Nil)
  val k:List[String] = Nil
  val q:List[Nothing] = Nil
  fn(y)

  val l = Nil
  fn(l)
  fn2(l)
  fn(q)
  fn2(q)
}
