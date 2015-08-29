// object is Scala singleton

object MyObject {
	def main(args: Array[String]) {
		println("Command line arguments:")
		args foreach { x => println(x) }
	}
}