/**
  * Created by yasutaka_higa on 2017/05/22.
  */
object S17 {
  def split(i: Int, list: List[Symbol]) = {
    def _split(j: Int, li: List[Symbol], p: (List[Symbol], List[Symbol])): (List[Symbol], List[Symbol]) = li match {
      case (x :: xs) => if (j < i) _split(j+1, xs, ((x :: p._1), p._2))
                        else       _split(j+1, xs, (p._1, (x :: p._2)))
      case _ => p
    }
    val p = _split(0, list, ((Nil: List[Symbol]), (Nil: List[Symbol])))
    (p._1.reverse, p._2.reverse)

  }


}
