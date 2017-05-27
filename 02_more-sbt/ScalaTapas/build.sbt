lazy val root = (project in file(".")).
  settings(
    name := "Scala Tapas",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.12.1",
    organization := "org.malagascala"
  )

libraryDependencies  ++= Seq(
  // include Scalactic and Scalatest
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

// for Scalastyle
resolvers ++= Seq(
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)
