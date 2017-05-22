/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object P11 {
  def encodeModified(list: List[Symbol]) = P10.encode(list).map(t => if(t._1 == 1) t._2 else t)

}
