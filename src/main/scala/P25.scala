import scala.util.Random

/**
  * Created by yasutaka_higa on 2017/05/22.
  */
object P25 {
  def randomPermute(li: List[Symbol]): List[Symbol] = li match {
    case Nil => Nil
    case _ => {
      val r = new Random()
      P20.removeAt(r.nextInt(li.length), li) match {
        case (l, s) => s :: randomPermute(l)
      }
    }
  }
}
