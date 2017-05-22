import java.util.Random

/**
  * Created by yasutaka_higa on 2017/05/22.
  */


object P24 {
  def lotto(length: Int, limit: Int): List[Int] = {
    val random = new Random()
    (1 to length).toList.map(_ => random.nextInt(limit))
  }
}
