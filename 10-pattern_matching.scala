/*
Like C++ case, but:
	* no fall-through
	* if there is no specific case, the exception will be thrown
*/

def classifyNums(i: Int): String = 
	i % 2 match {
		case 0 => "even"
		case 1 => "odd"			// if same case is absent - will be an error: scala.MatchError: 1
	}
	
println(classifyNums(12))
println(classifyNums(17))

// ----------------------------------------------------------------------------------------------------------

def classifyNums2(x: Any): String = 
	x match {
		case x: Int => x % 2 match { 
			case 0 => "Number is even int"
			case 1 => "Number is odd int"
		}
		case x: Double => "Number if double"
		case null => "This is null"
		case _ => "This is not a number"
	}


println(classifyNums2(14))
println(classifyNums2(15))
println(classifyNums2(14.2))
println(classifyNums2(null))
println(classifyNums2("xyz"))
println(classifyNums2(1.2d))			// Double literal
println(classifyNums2(1.2f))			// Float literal		-- function returns "This is not a number"
