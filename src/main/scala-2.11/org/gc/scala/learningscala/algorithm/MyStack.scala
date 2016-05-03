package org.gc.scala.learningscala.algorithm

/**
  * Created by gchand on 1/28/2016.
  */
class MyStack(val n:Int = 100){
  private var top = -1
  private val stk = Array(n)

  def isEmpty() = top == -1

  def push(x: Int) = {
    if(top == 100) throw new StackOverflowError("Maximum size allowed is 100")
    else {
      top += 1
      stk(top) = x
    }
  }

  def pop() = {
    if(!isEmpty()){
      stk(top)
      top -= 1
    }else{
      throw new NegativeArraySizeException("Empty Array. No elements to pop")
    }
  }
}

class MinStack extends MyStack {

}


