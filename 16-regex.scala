val s = """The
	  | quick
 	  | brown
	  | fox
	  | jumps 
	  | over 
	  | the 
	  | lazy 
	  | dog""".stripMargin

val trigramPattern = "\\b\\w{3}\\b".r

println(s)

// Find by regex
println(s"Find first: ${trigramPattern.findFirstIn(s)}")
println(s"Find all: ${List() ++ trigramPattern.findAllIn(s)}")

// Replace by regex
println(s"Replace first: ${trigramPattern.replaceFirstIn(s, "a").replace("\r\n", "")}")
println(s"Replace all: ${trigramPattern.replaceAllIn(s, "...").replace("\r\n", "")}")

// Extracting part of string by regex
val articleNounPattern = "\\b([Tt]he)\\s+(\\w+)\\b".r

// val articleNounPattern(article, noun) = s 							-- scala.MatchError
// val articleNounPattern(article, noun) = s.substring(0, 19).replace("\r\n", "")		-- scala.MatchError: The quick brown (of class java.lang.String)
val articleNounPattern(article, noun) = "The fox"
println(s"$article $noun")
