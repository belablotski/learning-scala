// Functions composition

def f(x: Double): Double = x + 2.0

def g(x: Double): Double = x * 2.0

// Left-associative
val fg = f _ compose g _
val gf = g _ compose f _

println(fg(3))			// f(g(3)) = 3 * 2 + 2 = 8
println(gf(3))			// g(f(3)) = (3 + 2) * 2 = 10


// Right-associative
val gf2 = f _ andThen g _
println(gf2(3))			// g(f(3)) = (3 + 2) * 2 = 10

