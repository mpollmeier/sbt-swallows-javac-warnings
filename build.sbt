scalaVersion := "2.12.2" // doesn't really matter, no scala files in here
javacOptions ++= Seq("-Xlint:all", "-Werror")

libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.8"
