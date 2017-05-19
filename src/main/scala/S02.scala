/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object S02 {
  def penultimate(list: List[Int]) : Int = list match {
    case (x :: _  :: Nil) => x
    case (_ :: xs)        => penultimate(xs)
    case _               => throw new RuntimeException()
  }
}
