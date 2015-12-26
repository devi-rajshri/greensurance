name := "greensurance"

version := "1.0"

lazy val `greensurance` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc , cache , ws )

libraryDependencies += "com.typesafe.play" %% "anorm" % "2.4.0"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  