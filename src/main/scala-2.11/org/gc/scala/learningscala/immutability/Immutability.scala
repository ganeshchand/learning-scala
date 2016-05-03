package org.gc.scala.learningscala.immutability

/**
  * Created by gchand on 4/28/2016.
  */
class Foo
class Immutability {
  def someTest() = true
  def main(args: Array[String]) {
    val foo1 =
      if(someTest()){
        //someFoo
      }else new Foo
  }
}
