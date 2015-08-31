/*
Case classes are regular classes which export their constructor parameters and which 
provide a recursive decomposition mechanism via pattern matching.

    * JavaBean style domain class (getters/setters (but with own Scala style), toString, equals)
    * Factory method to create instances
    * Pattern matching
*/

case class Purse(private val amount: Double, private val currency: String)

val p1 = Purse(5.0, "USD")

// toString() is generated automatically for case class
println(p1)
println(p1.toString())
val p2 = Purse(currency="USD", amount=10.0)
println(p2)

// copy() is auto generated
val p3 = p2.copy()
println(p3)

// --------------------------------------------------------------------------------------------

// operator overloading
case class PurseMath(private val amount: Double, private val currency: String) {
	def +(other: PurseMath) = PurseMath(amount + other.amount, currency)
}

val pm1 = PurseMath(3.0, "USD")
val pm2 = PurseMath(5.6, "USD")
println(pm1 + pm2)

// --------------------------------------------------------------------------------------------

// Abstract super class Term and three concrete case classes Var, Fun, and App.
// Example from http://docs.scala-lang.org/tutorials/tour/case-classes.html
// To facilitate the construction of case class instances, Scala does not require that the new primitive is used.

abstract class Term
case class Var(name: String) extends Term
case class Fun(arg: String, body: Term) extends Term
case class App(f: Term, v: Term) extends Term

println(Fun("x", Fun("y", App(Var("x"), Var("y")))))

// Pretty-printer implementation
object TermTest {
  def printTerm(term: Term) {
    term match {
      case Var(n) =>
        print(n)
      case Fun(x, b) =>
        print("^" + x + ".")
        printTerm(b)
      case App(f, v) =>
        print("(")
        printTerm(f)
        print(" ")
        printTerm(v)
        print(")")
    }
  }
  
  def isIdentityFun(term: Term): Boolean = term match {
    case Fun(x, Var(y)) if x == y => true
    case _ => false
  }
}

val id = Fun("x", Var("x"))
val t = Fun("x", Fun("y", App(Var("x"), Var("y"))))
TermTest.printTerm(t)
println(TermTest.isIdentityFun(id))
println(TermTest.isIdentityFun(t))