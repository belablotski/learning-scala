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

// ----------------------------------------------------------------------------------------------------------

// case + if
def classifyNums3(x: Any): String = 
	x match {
		case x: Int	if 0 to 9 contains x => "Number is 0 <= Int < 10"
		case x: Double => "Number if double"
		case null => "This is null"
		case _ => "This is not a number"
	}


println(classifyNums3(1))		// Number is 0 <= Int < 10
println(classifyNums3(15))		// This is not a number


// case + if
def classifyNums4(x: Any): String = 
	x match {
		case x if 0 to 9 contains x => "Number is 0 <= Int < 10"
		case x if 10 to 99 contains x => "Number is 10 <= Int < 100"
		case x: Int => "Another integer"
		case _ => "This is not a integer number"
	}


println(classifyNums4(1))		
println(classifyNums4(15))
println(classifyNums4(150))
println(classifyNums4(5.4))
