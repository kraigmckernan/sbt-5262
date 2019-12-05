import org.scalatest.{FunSuite, Matchers}

class ATest extends FunSuite with Matchers {
  test("a test") {
    1 should be (1)
  }
}
