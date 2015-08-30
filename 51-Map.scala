/*
Scala maps
*/

var m1 = Map("k1" -> 1, "k2" -> 2)
println(m1)

// Element of map is tuple
val kvPairAsTuple = "k3" -> 3			// tuple
m1 = m1 + kvPairAsTuple
println(m1)						// Map(k1 -> 1, k2 -> 2, k3 -> 3)

val kvPairAsTuple2 = ("k4", 4)			// tuple
m1 += kvPairAsTuple2
println(m1)						// Map(k1 -> 1, k2 -> 2, k3 -> 3, k4 -> 4)

println(m1("k4"))					// 4
//println(m1("k5"))				// java.util.NoSuchElementException: key not found: k5


// --------------------------------------------------------------------------------------------------------------

// More save way to get value from map

println(m1 getOrElse("k5", "UNKNOWN"))	// UNKNOWN	-- get from Map with default value if key is absent


// Option type wraps value into object that can either return the type None if the value is null, or Some(value) otherwise.

println(m1 get "k4")				// Some(4)
println(m1 get "k4" get)				// 4
println(m1 get "k5")				// None


// Working with Option

val optionRes = m1 get "k5"
val checkRes = optionRes match {
	case None => println("none!")
	case Some(value) => println("Value: " + value)
}
