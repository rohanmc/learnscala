package cc1
case class User(id: Long, name: String, raid: String)

object CaseClass1 extends App {
  val user1 = User(1,"algalon","ulduar")
  val user2: User = User(2,"yoggsaron","ulduar")

  println(s"user1 id: ${user1.id}")
  println(s"user1 name: ${user1.name}")
  println(s"user1 email: ${user1.raid}")

  println(s"user2 id: ${user2.id}")
  println(s"user2 name: ${user2.name}")
  println(s"user2 email: ${user2.raid}")
}


