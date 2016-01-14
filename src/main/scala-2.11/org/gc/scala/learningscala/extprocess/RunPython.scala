package org.gc.scala.learningscala.extprocess
import sys.process
/**
  * Created by gchand on 1/12/2016.
  */
object RunPython {
  def main(args: Array[String]) {
    // For Windows - http://stackoverflow.com/questions/9886123/executing-shell-commands-from-scala-repl/9895339#9895339
    implicit def stringToDosProcess(s: String) =
      scala.sys.process.stringToProcess("cmd /C "+ s)
    "dir".!
    """set PYTHON_HOME = "C:\\Python34""".!
    """set PATH=%PATH%;%PYTHON_HOME%""".!
    """echo %PYTHON_HOME%""".!
    """python C:\\gh\\ganeshchand\\python\\learning-python\\src\\scripts\\hello-world.py""".!
  }
}
