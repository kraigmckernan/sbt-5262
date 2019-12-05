val p0 = project.settings(Seq(fork in Test := true, libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"))
val p1 = project.settings(Seq(fork in Test := true, libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"))
val p2 = project.settings(Seq(fork in Test := true, libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"))
val p3 = project.settings(Seq(fork in Test := true, libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"))
val p4 = project.settings(Seq(fork in Test := true, libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"))
val p5 = project.settings(Seq(fork in Test := true, libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"))
val p6 = project.settings(Seq(fork in Test := true, libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"))
val p7 = project.settings(Seq(fork in Test := true, libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"))
val p8 = project.settings(Seq(fork in Test := true, libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"))
val p9 = project.settings(Seq(fork in Test := true, libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"))

fork in Test := true

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oD")
