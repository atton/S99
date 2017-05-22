/**
  * Created by yasutaka_higa on 2017/05/22.
  */

import scala.util.Random

object P23 {
  def randomSelect(i: Int, li: List[Symbol]): List[Symbol] = {
    val r = new Random()
    (1 to i).toList.map(_ => li(r.nextInt(i)))
  }
}
