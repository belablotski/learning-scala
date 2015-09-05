// Exception handling in Scala -- Functional Programming way

def div(a: Int, b: Int): Int = try { a / b } catch { case e: Throwable => { println("Problem!"); 0 } }

println(div(6, 3))		// 2
println(div(0, 0))		// 0 + problem logging


// The 'magic value' 48 isn't working:
// warning: a pure expression does nothing in statement position; you may be omitting necessary parentheses
def div48(a: Int, b: Int): Int = try { a / b } catch { case e: Throwable => { println("Problem!"); 0 } } finally { 48 }

println(div48(8, 2))	// 4
println(div48(0, 0))	// 0 + problem logging


def divF(a: Int, b: Int): Int = try { a / b } catch { case e: Throwable => { println("Problem!"); 0 } } finally { println("Finally...") }

println(divF(10, 2))	// 4
println(divF(0, 0))	// 0 + problem logging + finally section

