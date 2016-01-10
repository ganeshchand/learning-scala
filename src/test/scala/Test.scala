/**
  * Created by ganeshchand on 1/9/16.
  */
import org.scalatest.{FlatSpec}

class Test extends FlatSpec {
  "Empty String" should "have zero length" in {
    assertResult(0){ //expected
      "".length //actual
    }
  }
}
