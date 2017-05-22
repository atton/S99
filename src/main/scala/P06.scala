/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object P06 {
  def isPalindrome(list: List[Int]): Boolean = list.zip(list.reverse).forall(x => x._1 == x._2)

}
