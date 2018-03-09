name := "chapter-2"

version := "1.0"

// Spark does NOT support scala 2.12:
// https://stackoverflow.com/questions/42887359/using-scala-2-12-with-spark-2-1
// https://issues.apache.org/jira/browse/SPARK-14220
// https://mvnrepository.com/artifact/org.apache.spark/spark-core
// scalaVersion := "2.12.4"

scalaVersion := "2.11.7"

// Don't confuse '%' with '%%':
// https://stackoverflow.com/questions/43873639/sbt-got-error-when-run-spark-hello-world-code
libraryDependencies ++= Seq(
  // This seems to be a problem in idea:
  // https://stackoverflow.com/questions/37505380/java-lang-noclassdeffounderror-scala-reflect-api-typecreator
  // https://github.com/sbt/sbt/issues/2958
  "org.scala-lang" % "scala-reflect" % s"${scalaVersion}" % "provided",
  "org.apache.spark" %% "spark-core" % "2.2.0",
  "org.apache.spark" %% "spark-mllib" % "2.2.0",
  "com.typesafe.akka" %% "akka-actor" % "2.5.6")
