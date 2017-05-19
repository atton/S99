/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object S09 {

  def _encode(list: List[(Int, Symbol)]): List[(Int, Symbol)] = list match {
    case ((x, a) :: (y, b) :: xs) => if (a == b) _encode((x+y, a) :: xs) else (x,a) :: _encode((y,b) :: xs)
    case x => x
  }

  def encode(list: List[Symbol]): List[(Int, Symbol)] = _encode(list.map(x => (1, x)))
}
