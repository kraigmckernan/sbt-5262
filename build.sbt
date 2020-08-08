val p0 = project.settings(settings)
val p1 = project.settings(settings)
val p2 = project.settings(settings)
val p3 = project.settings(settings)
val p4 = project.settings(settings)
val p5 = project.settings(settings)
val p6 = project.settings(settings)
val p7 = project.settings(settings)
val p8 = project.settings(settings)
val p9 = project.settings(settings)

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oGK")

lazy val NoConcurrency = Tags.Tag("no concurrency for integration tests")
lazy val settings = Seq(
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0-M2" % "test",
  fork in IntegrationTest := true,
  tags in test += NoConcurrency      -> 1,
  concurrentRestrictions in Global += Tags.limit(NoConcurrency, 1)
)

addCommandAlias("blah", ";clean;test")

import complete.Parser._
import complete.Parsers._
commands +=
  Command("repeat")(s => Space.+ ~> (IntBasic <~ Space.+) ~ matched(s.combinedParser)) {
    case (s, (i, cmd)) => (1 until i).foldLeft(cmd :: s) { case (st, _) => cmd :: st }
  }
