package demo

abstract class Human{
  def fuck(): Unit ={
    println("Human fuck")
  }
}

class Chinese extends Human with Animal {
  override def run(): Unit = {
    println("Chinese run")
  }
}

object Chinese{
  def main(args: Array[String]): Unit = {

    val c = new Chinese()
    c.run()
    c.fuck()
  }
}