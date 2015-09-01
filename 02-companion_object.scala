// Most singleton objects do not stand alone, but instead are associated with a class of the same name. 
// The "singleton object of the same name" of a case class, mentioned above, is an example of this. 
// When this happens, the singleton object is called the companion object of the class, and the class 
// is called the companion class of the object.
// Example from http://docs.scala-lang.org/tutorials/tour/singleton-objects.html

// static is not a keyword in Scala. 
// Instead, all members that would be static, including classes, should go in a singleton object instead. 
// They can be referred to with the same syntax, imported piecemeal or as a group, and so on.

/*
class IntPair(val x: Int, val y: Int)

object IntPair {
  import math.Ordering
  implicit def ipord: Ordering[IntPair] =
    Ordering.by(ip => (ip.x, ip.y))
}

val p1 = new IntPair(1, 2)
println(p1.x, p1.y)
val p2 = new IntPair(2, 1)
println(p2.x, p2.y)
*/

// ---------------------------------------------------------------------------------------------------

// Companion Object - consists of an object that cohabits with a class of the same name in the same package and file.

class Person(aName: String) {
	private val name: String = aName
	
	import Person.prn
	override def toString = prn(name)
}

object Person {
	private def prn(name: String): String = "Name: " + name
}

val person = new Person("Test")
println(person.toString())