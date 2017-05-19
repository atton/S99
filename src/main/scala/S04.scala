/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object S04 {
  def length(list: List[Int]) = list.map(_ => 1).foldLeft(0)(_ +_ )

}
