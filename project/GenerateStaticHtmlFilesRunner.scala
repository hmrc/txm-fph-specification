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

import sbt.*
import uk.gov.hmrc.sbtdistributables.*
import uk.gov.hmrc.sbtdistributables.SbtDistributablesPlugin.distTgzTask

import scala.sys.process.*

object GenerateStaticHtmlFilesRunner extends AutoPlugin {

  override def requires = SbtDistributablesPlugin

  override def trigger = AllRequirements

  private val generateFiles = TaskKey[Int]("generateFiles", "Generates static files for Ruby application")

  override def projectSettings: Seq[Setting[_]] =
    Seq(
      generateFiles := {
        generateStatusFilesProcess
      },
      distTgzTask := (distTgzTask dependsOn generateFiles).value
    )

  def generateStatusFilesProcess: Int =
    {
      "bundle install" #&& Process(
        "bundle exec middleman build --build-dir=public/ --clean --verbose",
        None,
        "BASE_PATH" -> "/guides/fraud-prevention/"
      )
    }.!
}
