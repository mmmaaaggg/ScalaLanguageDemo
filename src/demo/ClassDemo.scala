package demo

import scala.io.Source

class ClassDemo (val id: String, var name:String, var age:Int=18){
//  val id = "9527"
//  var name = name
  private var gender = "男"
  private [this] var pop: String = _

  println("主构造器")
  try{
    val logg = Source.fromFile("d:/SpreadCustomRelateQuotation.xml").mkString
  }catch {
    case e: Exception => e.printStackTrace()
  } finally {
    println("finally")
  }

  def printPop={
    println(pop)
  }
}

// 伴生对象
object ClassDemo{
  def main(args: Array[String]): Unit = {
    val p = new ClassDemo("9527", "Tom")
    println("p.id, p.name, p.gender", p.id, p.name, p.gender, p.age)
    println("p.printPop", p.printPop)
  }
}