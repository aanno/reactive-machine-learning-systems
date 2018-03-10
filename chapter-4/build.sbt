name := "chapter-4"

version := "1.0"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  // This seems to be a problem in idea:
  // https://stackoverflow.com/questions/37505380/java-lang-noclassdeffounderror-scala-reflect-api-typecreator
  // https://github.com/sbt/sbt/issues/2958
  "org.scala-lang" % "scala-reflect" % s"${scalaVersion}" % "provided",
  "org.apache.spark" %% "spark-core" % "2.3.0" ,
  "org.apache.spark" %% "spark-mllib" % "2.3.0" ,
  "com.github.nscala-time" %% "nscala-time" % "2.8.0",
  "com.couchbase.client" %% "spark-connector" % "2.3.0")
