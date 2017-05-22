/**
  * Created by yasutaka_higa on 2017/05/22.
  */
object P21 {
  def insertAt(s: Symbol, i: Int, symbols: List[Symbol]): List[Symbol] = symbols match {
    case Nil => Nil
    case (x :: xs) => if (i == 0) s :: x :: xs else x :: insertAt(s, i-1, xs)
  }
}
