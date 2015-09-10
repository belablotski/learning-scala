/*
How Implicits work: 
if you call a method on a Scala object, and the Scala compiler does not have a definition for
that method in the class definition for that object, the compiler will try to convert
your object to an instance of a class that does have that method defined. 


For instance, "5".toInt

Scala compiler will see that Java’s String class does not have a toInt method defined,
but the StringOps class does, and that the StringOps class has a method that can
convert an instance of the String class into an instance of the StringOps class. 

In such case Scala compiler silently performs the conversion of String object into 
a StringOps object, and then calls the toInt method on the new object. 
*/