import org.mockito.Mockito._
import org.scalatest.concurrent.Timeouts
import org.scalatest.mockito.MockitoSugar
import org.scalatest.time.SpanSugar._
import org.scalatest.{FlatSpec, DiagrammedAssertions}
import main.scala._


class S99Spec extends FlatSpec with DiagrammedAssertions with MockitoSugar {

  "S01.last" should "return last element from list" in {
    assert(S01.last(List(1, 1, 2, 3, 5, 8))  === 8)
  }

  "S02.penultimate" should " return last but one element of a list" in {
    assert(S02.penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
  }
}