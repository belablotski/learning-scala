 /*
Immutable and Mutable collections.
Immutable by default -- additions, updates, or removals by returning new collection.
*/


for (x <- List(1, 2, 3, 4)) println(x)

println((List(1, 2, 3, 4, 5) reverse) drop 2 take 2)		// List(3, 2)

// ----------------------------------------------------------------------------

// cons operator
val lst1 = List(1, 2, 3, 4)
val lst2 = 1 :: 2 :: 3 :: 4 :: Nil				// Should be Nil at the end, because :: is right-associative
println(lst1)								// List(1, 2, 3, 4)
println(lst2)								// List(1, 2, 3, 4)
println(lst1 == lst2)						// true

// lists concatenation
println(lst1 ::: lst2)						// List(1, 2, 3, 4, 1, 2, 3, 4)
println(lst1 ::: lst2 head)					// 1
println(lst1 ::: lst2 tail)						// List(2, 3, 4, 1, 2, 3, 4)

// ----------------------------------------------------------------------------

println(List(1, 2, 3, 4) filter (_ % 2 == 1))			// List(1, 3)
println(List(1, 2, 3, 4) filterNot (_ % 2 == 1))		// List(2, 4)
println(List(1, 2, 3, 4) partition (_ % 2 == 1))		// (List(1, 3),List(2, 4))

val tuple = List(1, 2, 3, 4) partition (_ % 2 == 1)
println(tuple._1)							// List(1, 3)
println(tuple._2)							// List(2, 4)

val (odd, even) = tuple
println(odd)
println(even)

