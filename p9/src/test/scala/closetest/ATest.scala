import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ATest extends AnyFunSuite with Matchers {
  test("a test") {
    1 should be (1)
  }
}
