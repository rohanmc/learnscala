package cc3

case class User(id: Long, name: String, raid: String)

object CaseClass3 extends App {
  val user1: User = User(1, "algalon", "ulduar")

  println(s"copy with overwrite user1.copy(some attributes) ${user1.copy(id=2,name="yoggsaron")}")

}
