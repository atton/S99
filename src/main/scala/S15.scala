/**
  * Created by yasutaka_higa on 2017/05/19.
  */
object S15 {
  def duplicateN(i: Int, symbols: List[Symbol]) = symbols.flatMap(s => (1 to i).map(_ => s))
}
