// NScalaTime wrapper for JodaTime
// JodaTime and NScalaTime revolve around the DateTime class (objects of DateTime are immutable, unlike Java the Calendar/Date objects)
// JodaTime handles all of the tedious details of different time zones and other difficulties like Daylight Saving Time (when it performs duration calculations)

import com.github.nscala_time.time.Imports._

val dt1 = new DateTime(2015, 9, 22, 9, 58)
println(dt1.dayOfYear.get)

val dt2 = new DateTime(2015, 5, 20, 9, 0)
println(dt2 < dt1)

println((dt2 + 200.days) < dt1)


// Parsing dates

import java.text.SimpleDateFormat

val fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
val d = fmt.parse("2015-09-22 10:02:05")
val dt3 = new DateTime(d)


// JodaTime Duration object
val dur = new Duration(dt1, dt2)
dur.getMillis
dur.getStandardHours
dur.getStandardDays