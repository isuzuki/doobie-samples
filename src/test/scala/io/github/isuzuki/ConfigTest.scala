package io.github.isuzuki

import org.scalatest.{Matchers, WordSpec}

class ConfigTest extends WordSpec with Matchers {
  "loadConfig" should {
    "return database values" in {
      config.database.user shouldBe "test-user"
      config.database.pass shouldBe "test-pass"
      config.database.host shouldBe "127.0.0.1"
      config.database.db   shouldBe "test_db"
    }
  }
}
