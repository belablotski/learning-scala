// Anonymous Function Syntax

// Function with 1 parameter

(x: Int) => x * 10

val f = (x: Int) => x * 10
Array(1, 2, 3, 4, 5) map f foreach println

// ----------------------------------------------------------

// Function with 1 parameter

new Function1[Int, Int] {
	def apply(x: Int): Int = x * 10
}


val ff = new Function1[Int, Int] {
	def apply(x: Int): Int = x * 10
}
Array(1, 2, 3, 4, 5) map ff foreach println

// ----------------------------------------------------------

// Function without parameters

() => { System.getProperty("user.dir") }

val fff = () => { System.getProperty("user.dir") }
println(fff())

// ----------------------------------------------------------

// Function types

/*
Function1[Int, Int]				Int => Int
Function2[Int, Int, String]			(Int, Int) => String
Function0[String]					() => String
*/

// ----------------------------------------------------------

val res1 = List(1, 2, 3, 4) filter (x => x%2 == 1)
println(res1)