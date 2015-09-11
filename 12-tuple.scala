// Tuples in Scala

val t1 = (1,2,3)


// Special form for 2-tuple (1,2):
val t2 = 1 -> 2


// Working with tuples
println(t2._1)
println(t2.productElement(0))
println(t2.productArity)


val listOfTuples = List(1 -> 2, 3 -> 4, 5 -> 6, 7 -> 8)
val r = listOfTuples map { case (x, y) => x + y }
println(r)


val listOfTuples2 = List("k1" -> "v1", "k2" -> "v2", "k3" -> "v3")
listOfTuples2.foreach( 
	_ match {
		case ("k1", v) => println(s"Key one with value $v")
		case (k, v) => println(s"Unknown key $k with value $v")
	})
	
