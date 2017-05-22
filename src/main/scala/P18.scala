/**
  * Created by yasutaka_higa on 2017/05/22.
  */
object P18 {
  def slice(i: Int, j: Int, list: List[Symbol]): List[Symbol] = list match {
    case Nil => Nil
    case (x :: xs) => (i, j) match {
      case (0, 0) => List()
      case (0, n) => x :: slice(0, n - 1, xs)
      case (m, n) => slice(m - 1, n - 1, xs)
    }
  }
}
