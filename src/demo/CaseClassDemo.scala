package demo

import scala.util.Random

case class  SubmitTask(id:String, name:String)
case class  HeartBeat(time:Long)
case object CheckTimeOutTask

class CaseClassDemo {

}

object CaseClassDemo extends App{
  val arr = Array(CheckTimeOutTask, HeartBeat(12344), SubmitTask("001", "task-001"))
  arr(Random.nextInt(arr.length)) match {
    case SubmitTask(id, name) => {
      println(s"$id, $name")
    }
    case HeartBeat(time) => {
      println(s"time:$time")
    }
    case CheckTimeOutTask => {
      println("check")
    }
  }
}