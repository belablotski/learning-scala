// http://docs.scala-lang.org/tutorials/tour/mixin-class-composition.html
// As opposed to languages that only support single inheritance, Scala has a more general notion of class reuse. 
// Scala makes it possible to reuse the new member definitions of a class (i.e. the delta in relationship to 
// the superclass) in the definition of a new class. This is expressed as a mixin-class composition.
// Consider the following abstraction for iterators.


abstract class AbsIterator {
	type T
	def hasNext: Boolean
	def next: T
}

// To define a class that can be used as a mixin we use the keyword trait.
trait RichIterator extends AbsIterator {
	def foreach(f: T => Unit) { while (hasNext) f(next) }		// implementation for foreach()
}

// Here is a concrete iterator class, which returns successive characters of a given string.
class StringIterator(s: String) extends AbsIterator {
	type T = Char
	private var i = 0
	def hasNext = i < s.length()						// class with implementation fro hasNext() and next()
	def next = { val ch = s charAt i; i += 1; ch }
}

// Combine the functionality of StringIterator and RichIterator into a single class.
// Mixin-class composition allows to reuse the delta of a class definition, i.e., all new definitions that are not inherited. 
object StringIteratorTest {
	def main(args: Array[String]) {
		class Iter extends StringIterator(args(0)) with RichIterator			// combine two branches: hasNext()/next() and foreach()
		val iter = new Iter
		iter foreach println
	}
}

// test
StringIteratorTest.main(Array("abcd"))