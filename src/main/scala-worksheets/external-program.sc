object Test{
  def main(args: Array[String]) {
    Runtime.getRuntime()
    .exec("""set PYTHON_HOME = "C:\\Python34""")
    Runtime.getRuntime()
    .exec("""set PATH=%PATH%;%PYTHON_HOME%""")
    println(Runtime.getRuntime().exec("python C:\\gh\\ganeshchand\\python\\learning-python\\src\\scripts\\hello-world.py")
      .exitValue())



  }
}