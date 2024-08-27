/*
 * Copyright 2024 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import uk.gov.hmrc.sbtdistributables.*
import java.io.PrintWriter
import scala.io.{BufferedSource, Source}
import scala.sys.process.*
import sbt.*
import sbt.Keys.*

object GenerateStaticHtmlFilesRunner extends AutoPlugin {

  override def requires: SbtDistributablesPlugin.type = SbtDistributablesPlugin

  override def trigger: PluginTrigger = AllRequirements

  private val generateFiles: TaskKey[Unit] = TaskKey[Unit]("generateFiles", "Generates static files for Ruby application")
  private val generateSite: TaskKey[Unit]  = TaskKey[Unit]("generateSite", "Runs bundle exec middleman to generate the static site")
  private val rewriteAssetPaths: TaskKey[Unit] =
    TaskKey[Unit]("rewriteAssetPaths", "Rewrites asset paths required for deployment in an environment")

  override def projectSettings: Seq[Setting[?]] =
    Seq(
      generateFiles := rewriteAssetPaths.dependsOn(generateSite).value,
      generateSite := {
        streams.value.log.info("Generating static site...")

        val result = ("bundle install" #&& Process(
          "bundle exec middleman build --build-dir=public/ --clean --verbose",
          None,
          "BASE_PATH" -> "/guides/fraud-prevention/"
        )).!
        if (result != 0) sys.error("There was an error building the static site.")
      },
      rewriteAssetPaths := {
        streams.value.log.info("Rewriting asset paths...")

        val filePath: String        = "public/stylesheets/manifest.css"
        val originalContent: String = readFileContent(filePath)

        updateFileContent(
          filePath,
          originalContent.replace("url(\"", "url(\"/guides/fraud-prevention")
        )
      },
      (Compile / compile) := (Compile / compile).dependsOn(generateFiles).value
    )

  private def readFileContent(filePath: String): String = {
    val file: File             = new File(filePath)
    val source: BufferedSource = Source.fromFile(file, "UTF-8")
    try source.getLines().mkString("\n")
    finally source.close()
  }

  private def updateFileContent(filePath: String, newContent: String): Unit = {
    val file: File               = new File(filePath)
    val printWriter: PrintWriter = new PrintWriter(file, "UTF-8")
    try printWriter.write(newContent)
    finally printWriter.close()
  }
}
