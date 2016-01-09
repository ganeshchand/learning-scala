import org.scalatest.{FlatSpec, FunSuite}

/**
  * Created by ganeshchand on 1/9/16.
  */

// Traditional XUnit style
class SampleFunSuiteTest extends FunSuite {
  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }
  test("Invoking head on an empty Set should produce NoSuchElementException") {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }

  def add(x: Int = 0, y: Int = 0): Int = {
    x + y
  }

  test("default argument value should be 0") {
    assert(add() == 0)
  }
  test("default sum should be 0") {
    assert(add() == 0)
  }
}
