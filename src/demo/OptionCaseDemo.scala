package demo

object OptionCaseDemo extends App{
  val map = Map("a"->1, "b"->2)
  val opt1 = map.get("a")
  val opt2 = map.get("c")

  val v1 = map.getOrElse("a", 0)
  /*
  作用相當於 val v1 = map.getOrElse("a", 0)
   */
  val v = map.get("a") match{
    case Some(i) => i
    case None => 0
  }
  println("val v = map.get(\"a\") match{... --->", v)
}
