name := "learning-scala"

version := "1.0"

scalaVersion := "2.11.7"

/**Testing Frameworks**/
libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
  "junit" % "junit" % "4.11" % "test"
)