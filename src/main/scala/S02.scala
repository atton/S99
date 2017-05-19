/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object S02 {
  def penultimate(list: List[Int]) : Int = {
    val len = list.length
    if (len < 2) 0 else list(len-2)
  }
}
