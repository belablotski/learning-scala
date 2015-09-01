// Exception handling in Scala

def strToInt(s: String): Int = {
	try {
		return Integer.parseInt(s)
	} catch {
		case nfexc: NumberFormatException => 
			println("Wrong format: " + s)
			-1
		case exc: Exception => 
			println("Error: " + s)
			-2
		case _: Throwable =>
			println("Error: " + s)
			-3
	}
}

println(strToInt("24"))
println(strToInt("24a"))
println(strToInt("24.5"))
println(strToInt("NaN"))

// ----------------------------------------------------------------------------------------

// Using class Either to return valid result or error message

case class Error(val msg: String)

def strToIntEither(s: String) : Either[Error, Int] = {
	try {
		val res = Integer.parseInt(s)
		Right(res)
	} catch {
		case _ : Throwable => Left(Error("Some error"))
	}
}

println(strToIntEither("25"))			// Right(25)
println(strToIntEither("25a"))			// Left(Error(Some error))

// ----------------------------------------------------------------------------------------

// TODO: scala.util.Try