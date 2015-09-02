/*
for (sequence) yield expression

* Generators: drive iteration + first generator (must be at least one) determines the type of the result
   element <- collection
* Filters: control
   if expression
* Definitions: local variables
   variable = expression
*/


// Generator + filter
val r1 = for { x <- List(1,2,3,4,5)  if x % 2 == 1 } yield "Odd: " + x
println(r1)						// List(Odd: 1, Odd: 3, Odd: 5)

// Two generators
val r2 = for { 
	w <- List("Hello", "World") 
	ch <- w } yield ch
println(r2)						// List(H, e, l, l, o, W, o, r, l, d)

// "Local" variable
val r3 = for { 
	w <- List("Hello", "World") 
	ch <- w
	chu = ch.toUpper } yield chu
println(r3.distinct.sorted)			// List(D, E, H, L, O, R, W)