name := "SimpleOpenGL"

version := "1.0"

scalaVersion := "2.12.1"

mainClass in(Compile, run) := Some("name.lorenzani.andrea.SimpleOpenGL.SimpleOpenGL")

libraryDependencies ++= Seq(
  // For Maven related to JOGL: https://jogamp.org/wiki/index.php/Maven
  "org.jogamp.jogl" % "jogl-all-main" % "2.3.2", // Defaul import for JOGL
  "org.jogamp.gluegen" % "gluegen-rt-main" % "2.3.2", // Default import for JOGL
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)