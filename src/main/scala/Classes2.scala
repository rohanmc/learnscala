package Classes2

class Foo {
  private var i: Int = 10
  def geti():Int = {
    Foo.getc += 1
    i
  }
  def seti(x:Int) :Unit = {
    i = x
    Foo.setc += 1
  }
}

object Foo {
  private var getc = 0
  private var setc = 0
  def getGCounts():Int = getc
  def getSCounts():Int = setc

  def printCounts():Unit = {
    println(s"${Foo.getGCounts()}")
    println(s"${Foo.getSCounts()}")
  }
}


object My extends App {
  Foo.printCounts()
  val f:Foo = new Foo
  val g:Foo = new Foo
  Foo.printCounts()
  f.seti(10)
  g.seti(10)
  f.geti()
  f.seti(20)
  f.seti(30)
  f.geti()
  Foo.printCounts()

}
