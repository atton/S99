/**
  * Created by yasutaka_higa on 2017/05/22.
  */
object P20 {
  def removeAt(i: Int, list: List[Symbol]): (List[Symbol], Symbol) = list match {
    case Nil => throw new RuntimeException
    case (x :: xs) if (i == 0) => (xs, x)
    case (x :: xs) => removeAt(i-1, xs) match {case (li, s) => ((x :: li), s)}

  }

}
