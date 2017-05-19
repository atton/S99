import org.mockito.Mockito._
import org.scalatest.concurrent.Timeouts
import org.scalatest.mockito.MockitoSugar
import org.scalatest.time.SpanSugar._
import org.scalatest.{FlatSpec, DiagrammedAssertions}
import main.scala.S01


class S01Spec extends FlatSpec with DiagrammedAssertions with MockitoSugar {

  "S01.last" should "return last element from list" in {
    assert(S01.last(List(1, 1, 2, 3, 5, 8))  === 8)
  }
}