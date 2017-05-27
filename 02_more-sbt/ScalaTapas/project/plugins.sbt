addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")

// to include the SuperSafe Community Edition Scala compiler plugin, which will
// flag errors in your ScalaTest (and Scalactic) code at compile time, add the
// folliwng line in ~/.sbt/0.13/global.sbt
// resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
// then uncomment the following line
// addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.0-RC6")
