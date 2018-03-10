name := "chapter-3"

version := "1.0"

scalaVersion := "2.11.12"

resolvers ++=  Seq("ReactiveCouchbase Snapshots" at "https://raw.github.com/ReactiveCouchbase/repository/master/snapshots/",
  "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/")

libraryDependencies ++= Seq(
  // This seems to be a problem in idea:
  // https://stackoverflow.com/questions/37505380/java-lang-noclassdeffounderror-scala-reflect-api-typecreator
  // https://github.com/sbt/sbt/issues/2958
  "org.scala-lang" % "scala-reflect" % s"${scalaVersion}" % "provided",
  "org.reactivecouchbase" %% "reactivecouchbase-core" % "0.4-SNAPSHOT",
  "com.typesafe.play" %% "play-json" % "2.3.0")
