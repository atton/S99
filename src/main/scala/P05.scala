/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object P05 {
  def reverse(list: List[Int]): List[Int] = list.foldLeft(Nil: List[Int])((xs,x) => x :: xs)
}
