import play.sbt.PlayImport._
import sbt._

object AppDependencies {
  val bootstrapVersion = "7.15.0"

  val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-28" % bootstrapVersion
  )

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"          %% "bootstrap-test-play-28" % bootstrapVersion % Test,
    "org.scalatest"        %% "scalatest"              % "3.2.15"         % Test,
    "com.vladsch.flexmark" % "flexmark-all"            % "0.64.4"         % Test
  )
}
