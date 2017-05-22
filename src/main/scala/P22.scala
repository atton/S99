/**
  * Created by yasutaka_higa on 2017/05/22.
  */
object P22 {
  def range(i: Int, j: Int): List[Int] = if (i <= j) i :: range(i+1, j) else List()
}
