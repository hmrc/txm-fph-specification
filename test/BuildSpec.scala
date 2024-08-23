/*
 * Copyright 2023 HM Revenue & Customs
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

package test

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import java.io.File
import scala.io.{BufferedSource, Source}

class BuildSpec extends AnyWordSpec with Matchers {
  "Building the content" should {
    "rewrite font asset paths" in {
      val filePath: String = "public/stylesheets/manifest.css"

      val updatedContent: String = readFileContent(filePath)

      updatedContent should include("url(\"/guides/fraud-prevention")
    }
  }

  private def readFileContent(filePath: String): String = {
    val file: File             = new File(filePath)
    val source: BufferedSource = Source.fromFile(file, "UTF-8")
    try source.getLines().mkString("\n")
    finally source.close()
  }
}
