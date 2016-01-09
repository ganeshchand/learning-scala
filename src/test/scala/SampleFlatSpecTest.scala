import org.scalatest.FlatSpec

/**
  * Created by ganeshchand on 1/9/16.
  */
//BDD style test
class SampleFlatSpecTest extends FlatSpec {

  "Any empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }
  it should "produce NoSuchElementException when head is invoked" in {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }
}
