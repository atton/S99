/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object S12 {
  def decode(list: List[(Int, Symbol)]): List[Symbol] = list match {
    case Nil => Nil
    case ((x , s) :: xs) => (1 to x).map(_ => s).toList ++ decode(xs)
  }
}
