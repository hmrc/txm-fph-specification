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

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import java.io.{File, PrintWriter}
import scala.io.Source
import scala.language.postfixOps
import scala.sys.process.*

class BuildWithDockerSpec extends AnyWordSpec with Matchers {
  "Building the content" should {
    "produce static files" in {
      val result = "docker-compose -f docker-compose-build.yml up" !

      result shouldBe 0

      val fileHandle = new File("public/stylesheets/manifest.css")
      val source = Source.fromFile(fileHandle, "UTF-8")
      val content = source.getLines()
        .mkString("\n")
        .replace("url(\"", "url(\"/guides/fraud-prevention")
      source.close()

      val pw = new PrintWriter(fileHandle, "UTF-8")
      pw.write(content)
      pw.close()
    }
  }
}
