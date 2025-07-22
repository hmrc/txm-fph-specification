val appName = "txm-fph-specification"

lazy val microservice = Project(appName, file("."))
  .enablePlugins(play.sbt.PlayScala, SbtDistributablesPlugin)
  .settings(
    scalaVersion := "3.3.6",
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
    Global / lintUnusedKeysOnLoad := false,
    update / evictionWarningOptions := EvictionWarningOptions.default.withWarnScalaVersionEviction(false),
    majorVersion := 0,
    scalacOptions += "-Wconf:src=routes/.*:s"
  )
