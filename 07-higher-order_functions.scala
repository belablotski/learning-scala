// Higher-order functions - take other functions as parameters or whose result is a function
// http://docs.scala-lang.org/tutorials/tour/higher-order-functions.html


def apply(f: Int => String, v: Int) = f(v)

println(apply(x => x.toString(), 10))



// Methods are automatically coerced to functions if the context requires this.

class Decorator(left: String, right: String) {
	// polymorphic method (i.e. it abstracts over some of its signature types) and the Scala compiler has to instantiate its method type first appropriately.
	def layout[A](x: A) = left + x.toString() + right
}

def apply2(f: Int => String, v: Int) = f(v)
val decorator = new Decorator("[", "]")
println(apply2(decorator.layout, 7))
