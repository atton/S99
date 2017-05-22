/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object P13 {
  def encodeDirect(list: List[Symbol]): List[(Int, Symbol)] = list match {
    case (x :: xs) => (list.takeWhile(_ == x).length, x) :: encodeDirect(list.dropWhile(_ == x))
    case _ => List()
  }
}
