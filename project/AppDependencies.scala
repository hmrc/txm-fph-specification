import play.sbt.PlayImport._
import sbt._

object AppDependencies {
  val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-28" % "5.12.0"
  )

  val test: Seq[ModuleID] = Seq(
    "org.scalatest"          %% "scalatest"   % "3.2.9"   % "test",
    "com.vladsch.flexmark"   % "flexmark-all" % "0.35.10" % "test"
  )
}
