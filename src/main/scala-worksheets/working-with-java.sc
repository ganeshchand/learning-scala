import java.util.{Locale, Date}

// Interacting with Java
// All classes from java.lang packages are imported by default.
// Other classes need to be imported explicitly
val now = new Date
import java.text.DateFormat._
val df = java.text.DateFormat.getDateInstance(SHORT, Locale.US)
df.format(now)