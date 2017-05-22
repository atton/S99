/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object P07 {
  def flatten(list: List[Any]): List[Any] = list match {
    case Nil => Nil
    case x :: xs => x match {
      case l: List[Any] => flatten(l) ++ flatten(xs)
      case v: Any => v :: flatten(xs)
    }
  }
}
