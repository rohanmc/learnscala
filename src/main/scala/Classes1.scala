package classes

class TestClass {
  var i = 10
}

class TestClass2 {
  val i = 10
}

class TestClass3 {
  private var i = 30
  def geti(): Int = i
  def seti(s:Int) = {
    i = s
  }
}

object My extends App {
  val tx:TestClass = new TestClass()
  tx.i = 20
  println(s"${tx.i}")

  // can instantiate without parens
  val tx3:TestClass = new TestClass

  val tx2:TestClass2 = new TestClass2
  // wont compile because reassignment to val
  // tx2.i = 20
  // wont compile because tx2 is val
  // tx2 = new TestClass2

  var tx4:TestClass = new TestClass
  tx4 = new TestClass

  val tc3: TestClass3 = new TestClass3
  println(s"${tc3.geti()}")
  tc3.seti(30)
  println(s"${tc3.geti()}")

  // i is private for tc3
  // println(s"${tc3.i}")
}