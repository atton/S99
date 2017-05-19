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

  "S04.length" should "return number of elements of list" in {
    assert(6 === S04.length(List(1, 1, 2, 3, 5, 8)))
  }

  "S05.reverse" should "reverse a list" in {
    assert(S05.reverse(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1))
  }

  "S06.isParindrome" should "return whether a list is a palindrome" in {
    assert(true === S06.isPalindrome(List(1, 2, 3, 2, 1)))
    assert(true === S06.isPalindrome(List(1, 2, 2, 1)))
    assert(false === S06.isPalindrome(List(1, 2, 3, 2, 6)))

  }

  "S07.flatten" should "return flatten a nested list structure" in {
    assert(S07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1, 1, 2, 3, 5, 8))
  }

  "S08.compress" should "eliminate consecutive duplicates of list elements" in {
    assert(S08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      ===  List('a, 'b, 'c, 'a, 'd, 'e))
  }

  "S09.pack" should "pack consecutive duplicates of list elements into sublists" in {
    assert(S09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      === List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  "S10.encode" should "return Run-length encoding of a list" in {
    assert(S10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      ===  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

}