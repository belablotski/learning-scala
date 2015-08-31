// Traits ~ Java Interfaces: traits are used to define object types by specifying the signature of the supported methods. 
// Traits !~ Java Interfaces: Scala allows traits to be partially implemented: it is possible to define default implementations for some methods. 
// In contrast to classes, traits may not have constructor parameters.
// Conclusion: Traits lie between interfaces and abstract classes. But, we can only extend one abstract class whereas we can extend several traits.

// Note that the order in which traits are stacked is important. They are calling each other from right to left.

// Modified example from http://docs.scala-lang.org/tutorials/tour/traits.html

trait Similarity {
	def isSimilar(x: Any): Boolean							// doesn't implemented
	def isNotSimilar(x: Any): Boolean = !isSimilar(x)
}

class Point(xc: Double, yc: Double) extends Similarity {
	var x: Double = xc
	var y: Double = yc
	def isSimilar(obj: Any) =
		obj.isInstanceOf[Point] &&
		obj.asInstanceOf[Point].x == x &&
		obj.asInstanceOf[Point].y == y
}

object TraitsTest {
	def main(args: Array[String]) {
		val coords: Array[Double] = args map (x => x.toDouble)
		val p1 = new Point(coords(0), coords(1))
		val p2 = new Point(coords(2), coords(3))
		val p3 = new Point(coords(4), coords(5))
		println(p1.isSimilar(p2))
		println(p1.isNotSimilar(p2))
		println(p1.isSimilar(p3))
		println(p1.isNotSimilar(p3))
		println(p1.isSimilar(2))
		println(p1.isNotSimilar("xyz"))
	}
}

// test
TraitsTest.main(Array("1.5", "2.7", "1.5", "2.7", "5.1", "6.2"))