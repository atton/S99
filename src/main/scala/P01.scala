package main.scala

/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object P01 {
  def last(list : List[Int]) : Int = list match {
    case (x :: Nil) => x
    case (x :: xs)  => last(xs)
    case _          => throw new RuntimeException("empty list")
  }
}
