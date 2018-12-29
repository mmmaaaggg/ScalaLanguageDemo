package demo

class Dog(val id: String) {

  var name: String = _
  println("constructor main for " + id)

  def this(id: String, name: String){
    this(id)
    this.name = name
    println("constructor 2 for " + name)
  }
}

object Dog{
  def main(args: Array[String]): Unit = {
    val d1 = new Dog("abc")
    val d2 = new Dog("efg", "dofy")
  }
}