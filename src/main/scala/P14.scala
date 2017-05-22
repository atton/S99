/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object P14 {
  def duplicate(list: List[Symbol]): List[Symbol] = list match {
    case (x :: xs) => x :: x :: duplicate(xs)
    case _ => Nil
  }
}
