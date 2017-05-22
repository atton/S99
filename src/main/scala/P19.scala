/**
  * Created by yasutaka_higa on 2017/05/22.
  */
object P19 {
  def rotate(i: Int, list: List[Symbol]) = if (i > 0) P18.slice(i, i+list.length,list++list) else P18.slice(list.length+i, 2*list.length+i, list++list)
}