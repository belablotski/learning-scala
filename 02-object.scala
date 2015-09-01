// object is Scala singleton
// This is single-use class and single val-value initialized with the object of this class.
// A singleton object can extend classes and traits.

object MyObject {
	def main(args: Array[String]) {
		println("Command line arguments:")
		args foreach { x => println(x) }
	}
}