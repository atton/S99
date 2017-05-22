/**
  * Created by yasutaka_higa on 2017/05/22.
  */
object S16 {
  def drop(i: Int, list: List[Symbol]): List[Symbol] = list.zip(1 to list.length).foldRight(Nil: List[Symbol]){
    case ((s, idx), li) => if (idx % i == 0) li else s :: li
  }

}
