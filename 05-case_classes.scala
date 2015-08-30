/*
    * JavaBean style domain class
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

