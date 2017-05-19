import org.mockito.Mockito._
import org.scalatest.concurrent.Timeouts
import org.scalatest.mockito.MockitoSugar
import org.scalatest.time.SpanSugar._
import org.scalatest.{FlatSpec, DiagrammedAssertions}
import main.scala._


class S99Spec extends FlatSpec with DiagrammedAssertions with MockitoSugar {

  "S01.last" should "return last element from list" in {
    assert(8 === S01.last(List(1, 1, 2, 3, 5, 8)))
  }

  "S02.penultimate" should "return last but one element of a list" in {
    assert(5 === S02.penultimate(List(1, 1, 2, 3, 5, 8)))
  }

  "S03.nth" should "return Kth element of a list." in {
    assert(2 === S03.nth(2, List(1, 1, 2, 3, 5, 8)))

    intercept[Exception](S03.nth(0, List()))
    intercept[Exception](S03.nth(1, List()))
    intercept[Exception](S03.nth(1, List(0)))
    intercept[Exception](S03.nth(-1, List(0)))
  }
}