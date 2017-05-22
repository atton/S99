/**
  * Created by yasutaka_higa on 2017/05/22.
  */
object P26 {
  def combinations[T](i: Int, list: List[T]): List[List[T]] = {
    if (i == 1) list.map(List(_))
    else list.flatMap(e => combinations(i-1, list.dropWhile(e != _).drop(1)).map(e :: _))
  }
}
