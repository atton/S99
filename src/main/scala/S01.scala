package main.scala

/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object S01 {
  def last(list : List[Int]) : Int = {
    val len = list.length
    if (len == 0) 0 else list(len-1)
  }
}
