/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object S09 {


  def _pack(list: List[List[Symbol]]): List[List[Symbol]] = list match {
    case ((a :: ax) :: (b :: bx) :: xs) => if (a == b) _pack((a :: b :: ax) :: xs) else (a :: ax) :: _pack((b :: bx) :: xs)
    case x => x
  }

  def pack(list: List[Symbol]): List[List[Symbol]] = _pack(list.map(x => List(x)))

}
