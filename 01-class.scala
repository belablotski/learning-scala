// Scala class with immutable attributes
// Regex: http://www.scala-lang.org/api/current/index.html#scala.util.matching.Regex
// scala.Option -- Represents optional values. Instances of Option are either an instance of scala.Some or the object None.

class Email(email: String) {
	private val emailRegex = "(.*)@(.*)".r
	
	val localPart: String = emailRegex findFirstMatchIn email map (_ group 1) getOrElse "unknown"
	val domainPart: String = emailRegex findFirstMatchIn email map (_ group 2) getOrElse "unknown"
	
	override def toString(): String = localPart + "@" + domainPart
}

val email = new Email("test@hotmail.com")
println(email.toString())						// test@hotmail.com


// -----------------------------------------------------------------------------------------


// Scala class with mutable and immutable attributes

// class Purse(amount: Double, currency: String)            -- will not create fields
class Purse(var amount: Double, val currency: String)
val p = new Purse(100.0, "USD")
println(s"Purse(amount=${p.amount}, currency=${p.currency})")

p.amount += 250								// note that p is immutable (!)
p.amount_=(p.amount + 250)						// p.amount_ is generated setter for Purse.amount
println(s"Purse(amount=${p.amount}, currency=${p.currency})")

//p  = new Purse(120.0, "CAD")					// error: reassignment to val
