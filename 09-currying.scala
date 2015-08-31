// Curring - when a method is called with a fewer number of parameter lists, then this will yield a function taking the missing parameter lists as its arguments.


// Curring with method
// Good example from http://docs.scala-lang.org/tutorials/tour/currying.html

object CurryTest {
  def filter(xs: List[Int], p: Int => Boolean): List[Int] =
    if (xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail, p)
    else filter(xs.tail, p)
    
  def modN(n: Int)(x: Int) = ((x % n) == 0)
}

val nums = List(1, 2, 3, 4, 5, 6, 7, 8)
println(CurryTest.filter(nums, CurryTest.modN(2)))			// List(2, 4, 6, 8)
println(CurryTest.filter(nums, CurryTest.modN(3)))			// List(3, 6)


// ------------------------------------------------------------------------------------------------

// Curring with function

def add(n: Int)(i: Int) = i + n

println(List(1, 2, 3, 4, 5) map add(2))					// List(3, 4, 5, 6, 7)
println(List(1, 2, 3, 4, 5) map add(3))					// List(4, 5, 6, 7, 8)