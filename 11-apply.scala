/* apply() method gives a very important (for FP) syntax sugar: use object as a function */

object Incrementer {
	def apply(x: Int) = x + 1
}

val y = Incrementer(2)
println(y)				// 3


class Decrementer {
	def apply(x: Int) = x - 1
}

val decrementer = new Decrementer()
val z = decrementer(2)
println(z)				// 1

println(List(1, 2, 3, 4, 5) map (_ + 1))
println(List(1, 2, 3, 4, 5) map (Incrementer(_)))
println(List(1, 2, 3, 4, 5) map (decrementer(_)))

println(Incrementer)