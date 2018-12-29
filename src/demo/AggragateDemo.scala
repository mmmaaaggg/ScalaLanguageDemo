package demo

/**
  * arr1 普通list
  * arr2 带 par
  * aggregate 结果天壤之别
  * aggregate 第二个参数是将并发后的结果进行合并计算
  */
object AggragateDemo {
  def main(args: Array[String]): Unit = {

    val seqop = (x: Int, y:List[Int])=>{
      val z = x + y.sum
      println("seqop:" + x + "\t" + y + "=" + z )
      z
    }
    val combop = (x: Int, y:Int)=>{
      val z = x * y
      println("combop:" + x + "\t" + y + "=" + z )
      z
    }


    val arr1 = List(List(1,2,3), List(3,4,5), List(2), List(1))
    println("arr1:", arr1)
    val agged = arr1.aggregate(10)(seqop, combop)
    println("agged:", agged)
    println("-" * 10)
    val arr2 = List(List(1,2,3), List(3,4,5), List(2), List(1)).par
    println("arr2:", arr2)
    val agged2 = arr2.aggregate(10)(seqop, combop)
    println("agged:", agged2)
  }
}
