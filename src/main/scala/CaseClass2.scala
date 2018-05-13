package cc2
case class User(id: Long, name: String, raid: String)

object CaseClass2 extends App {
  val user1: User = User(1, "algalon", "ulduar")
  val user2: User = User(1, "algalon", "ulduar")
  val user3: User = User(2, "yoggsaron", "ulduar")

  println("scala adds toString, hashCode, equals and copy to case classes")
  println(s"user1 hashcode: ${user1.hashCode()}")
  println(s"user2 hashcode: ${user2.hashCode()}")
  println(s"user3 hashcode: ${user3.hashCode()}")
  println(s"user3 copy hashcode: ${user3.copy().hashCode()}")
  println(s"user1.equals(user2) : ${user1.equals(user2)}")
  println(s"user3.equals(user3.copy()) : ${user3.equals(user3.copy())}")
  println(s"user1 == user2 : ${user1 == user2}")

}
