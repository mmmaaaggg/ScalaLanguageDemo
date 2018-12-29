package demo

import scala.collection.immutable

object HelloWorld {
  def main(args: Array[String]) {
    val str = "hello world"
    println(str)
    println("for (i <- range1) {")
    val range1 = 1 to 10
    for (i <- range1) {
      println(i)
    }
    println("for (i <- 1 to 3; j <- 1 to 3 if i != j)")
    for (i <- 1 to 3; j <- 1 to 3 if i != j)
      println(10 * i + j)

    println("yield test")
    val yv: immutable.IndexedSeq[Int] = for (i <- 1 to 10) yield i * 10
    for (i <- yv)
      println(i)
    println("map test: immutable.IndexedSeq[Int] = 1.to(10).map(_*10)")
    val mv: immutable.IndexedSeq[Int] = 1.to(10).map(_*10)
    println(mv)
    println("def test: def m1(a:Int, b: Int): Int= a* b")
    def m1(a:Int, b: Int): Int= a* b
    println("function test: m1(3,4)", m1(3,4))
    println("val ff = (x: Int, y:Int)=>{x + y}")
    val ff = (x: Int, y:Int)=>{x + y}
    println("ff(4, 5)", ff(4, 5))

    println("two different way to declare function")
    val func1:(Int, Double) => (Double, Int) = {
      (a,b)=>(b,a)
    }
    val func2=(a:Int, b:Double)=>{(b,a)}
    println("func1(123,234.0)", func1(123,234.0))
    println("func2(123,234.0)", func2(123,234.0))

    println("def -> function")
    def m2(x: Int, y: Int): Int = x + y
    val f2 = m2 _
    println("def m2(x: Int, y, Int): Int = x + y  --> function ")
    println(f2)
  }
}
