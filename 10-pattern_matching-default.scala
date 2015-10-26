/*
// Without care about actual value:
case _ => println("Default")

// Need to analyze default value:
case default => println("Default: " + default)
*/

val cmd = "b"
cmd match {
	case "a" | "e" | "i" | "o" | "u" => println("vowel")
	case default => println(s"consonant ($default)")
}