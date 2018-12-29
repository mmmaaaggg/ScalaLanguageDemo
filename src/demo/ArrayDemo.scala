package demo

import scala.collection.mutable
import scala.collection.mutable.HashMap
import scala.collection.mutable.Map
import scala.collection.mutable.ArrayBuffer

object ArrayDemo {
  def main(args: Array[String]): Unit ={
    val arr1 = new Array[Int](10)
    println("new Array[Int](10)", arr1.toBuffer)
    val arr2 = Array[Int](10, 9, 8, 7, 6, 5)
    println("Array[Int](10, 9, 8, 7, 6, 5)", arr2.toBuffer)
    val ab1 = ArrayBuffer[Int](10)
    println("val ab1 = ArrayBuffer[Int](10)", ab1)
    ab1 += 1
    println("ab1 += 1", ab1)
    ab1 += (2, 3, 4)
    println("ab1 += (2, 3, 4,)", ab1)

    val mmv = mutable.Map[String, Int]("a" -> 1, "b" -> 2)
    mmv("j")= 23
    println("vmm(\"j\")= 23", mmv)
    mmv += (("o", 24))
    println("vmm += ((\"o\", 24))", mmv)

    println("tuple test")
    val tt = (1, "tuple", 3)
    println("(1, \"tuple\", 3)", "tt._2=", tt._2)
    val tt1, (x, y, z) = (1, 2, 3)
    println("val tt, (x, y, z) = (1, 2, 3)", tt1, x, y, z)
  }
}
