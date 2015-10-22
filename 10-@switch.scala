// The @switch generates a warning at compile time if the switch can't be compiled to a tableswitch or lookupswitch.
// Compiling match to a tableswitch or lookupswitch is better for performance (it can jump directly to the result rather than walking through the decision tree)
// Check javap -c SwitchTest

// This code is clear (simple, available in compile time, values are used).
// Example with warning: 10-@switch_v2.scala

import scala.annotation.switch

class SwitchTest {
  val i = 1
  val x = (i: @switch) match {
    case 1 => "First"
    case 2 => "Second"
    case 3 => "Third"
    case _ => "Other"
  }
}

println((new SwitchTest).x)