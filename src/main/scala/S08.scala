/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object S08 {
  def compress(list: List[Symbol]): List[Symbol] = list match {
    case (a :: b :: xs) => if (a == b) compress(b :: xs) else a :: compress(b :: xs)
    case x              => x
  }
}
