name := "DataStructureUsingScala"

version := "0.1"

scalaVersion :="2.13.12"

val scalaTestVersion = "3.2.18"

libraryDependencies ++= {
  Seq(
    "org.scalatest" %% "scalatest" % scalaTestVersion % Test,
    "com.typesafe.akka" %% "akka-actor" % "2.8.8",
    "com.typesafe.akka" %% "akka-actor-typed" % "2.8.8",
  )
}

