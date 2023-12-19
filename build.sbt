val appName = "txm-fph-specification"

lazy val microservice = Project(appName, file("."))
  .enablePlugins(play.sbt.PlayScala, SbtDistributablesPlugin)
  .settings(
    scalaVersion := "2.13.12",
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
    Global / lintUnusedKeysOnLoad := false,
    update / evictionWarningOptions := EvictionWarningOptions.default.withWarnScalaVersionEviction(false),
    majorVersion := 0,
    scalacOptions += "-Wconf:src=routes/.*:s",
  )
  .settings(
    resolvers += Resolver.jcenterRepo
  )
