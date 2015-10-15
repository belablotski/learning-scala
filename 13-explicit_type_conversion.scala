println("10".toByte)
println(s"Byte.MinValue=${Byte.MinValue}, Byte.MaxValue=${Byte.MaxValue}")
println("10".toShort)
println("10".toInt)
println("10".toLong)

println("123.456".toDouble)
println("123.456".toFloat)

println(BigInt("123"))
println(BigDecimal("123.456"))
println(BigInt("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"))
println(BigDecimal("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890.09876543210987654321098765432109876543210987654321098765432109876543210987654321"))


// -----------------------------------------------------------------------------------------

// Converting between numeric types (i.e. casting)

println(1.234.toByte)
println(1.234.toShort)
println(1.234.toInt)
println(1.234.toLong)
println(1.234.toFloat)
println(1.234.toDouble)

println(128L)
println(128L.isValidByte)		// false
println(128L.isValidShort)		// true

println(127.1D)
println(127.1D.isValidByte)		// false
println(127.1D.isValidShort)		// false
println(128d.isValidByte)		// false
println(128d.isValidShort)		// true

println(123: Short)
println((123: Short).isValidByte)	// true