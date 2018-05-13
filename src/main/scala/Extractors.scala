package extractors

sealed trait CelestialBody {
  val name:String
  val radius:Long
  val galaxy:String
}

object CelestialBody {
  def unapply(c:CelestialBody): Option[(String,Long,String)] = Some((c.name,c.radius,c.galaxy))
}

class Planet(n:String,r:Long,g:String, s:String) extends CelestialBody {
  val name:String = n
  val radius:Long = r
  val galaxy:String = g
  val orbitingStar:String = s
}

object Planet {
  def unapply(p:Planet): Option[(String,Long,String,String)] = Some((p.name,p.radius,p.galaxy,p.orbitingStar))
}

class Star(n:String,r:Long,g:String,l:Long) extends CelestialBody {
  val name:String = n
  val radius:Long = r
  val galaxy:String = g
  val luminosity:Long = l
}

object Star {
  def unapply(s:Star): Option[(String,Long,String,Long)] = Some((s.name,s.radius,s.galaxy,s.luminosity))
}

class Moon(n:String,r:Long,g:String,p:String) extends CelestialBody {
  val name:String = n
  val radius:Long = r
  val galaxy:String = g
  val planet:String = p
}

object Moon {
  def unapply(m:Moon): Option[(String,Long,String,String)] = Some((m.name,m.radius,m.galaxy,m.planet))
}

object My extends App {

  def describeCelestialBody(x:CelestialBody) :Unit = x match {
    case Star(name,radius,galaxy,luminosity) => println(s"Star name: ${name}\n" +
      s"Star radius: ${radius} KM\n" +
      s"Star Galaxy: ${galaxy}\n" +
      s"Star Luminosity: ${luminosity} L\n\n")
    case Planet(name,radius,galaxy,star) => println(s"Planet name: ${name}\n" +
      s"Planet radius: ${radius} KM\n" +
      s"Planet galaxy: ${galaxy}\n" +
      s"Planet orbits: ${star}\n\n")
    case CelestialBody(name,radius,galaxy) => println(s"Unknown Celestial,  name: ${name}\n" +
      s"Unknown Celestial, radius: ${radius} KM\n" +
      s"Unknown Celestial galaxy: ${galaxy}\n\n")
  }

  val sun:Star = new Star("Sol",695508, "Milky way", 1)
  val arcturus:Star = new Star("Arcturus",17670780, "Milky way", 170)
  val earth:Planet = new Planet("Earth", 6371, "Milky way", "Sol")
  val luna:Moon = new Moon("Luna", 1737, "Milky way", "Earth")

  describeCelestialBody(sun)
  describeCelestialBody(arcturus)
  describeCelestialBody(earth)
  describeCelestialBody(luna)

}



