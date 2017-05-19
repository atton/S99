/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object S03 {
  def nth(i: Int, list: List[Int]): Int  = (i, list) match {
    case (0, (x :: _))  => x
    case (i, (x :: xs)) => nth(i - 1, xs)
    case (_, _) => throw new RuntimeException()
  }
}
