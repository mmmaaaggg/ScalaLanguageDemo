package demo

object WordCount {
  def main(args: Array[String]): Unit ={
    val source = List("hello star tom cat", "mom cat moon star hello", "mom hello mom moon star hello")
    println("source:", source)
    val ll = source.flatMap(_.split(" "))
    val grouped = ll.map((_,1)).groupBy(_._1)
    val grouped_ll = grouped.map(t=>(t._1, t._2.size)).toList.sortBy(_._2).reverse
    val grouped_ll2 = grouped.mapValues(_.size).toList.sortBy(_._2).reverse
    println("grouped_ll:", grouped_ll)
  }
}
