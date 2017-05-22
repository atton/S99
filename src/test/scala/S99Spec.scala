import org.mockito.Mockito._
import org.scalatest.concurrent.Timeouts
import org.scalatest.mockito.MockitoSugar
import org.scalatest.time.SpanSugar._
import org.scalatest.{FlatSpec, DiagrammedAssertions}
import main.scala._


class S99Spec extends FlatSpec with DiagrammedAssertions with MockitoSugar {

  "P01.last" should "return last element from list" in {
    assert(8 === P01.last(List(1, 1, 2, 3, 5, 8)))
  }

  "P02.penultimate" should "return last but one element of a list" in {
    assert(5 === P02.penultimate(List(1, 1, 2, 3, 5, 8)))
  }

  "P03.nth" should "return Kth element of a list." in {
    assert(2 === P03.nth(2, List(1, 1, 2, 3, 5, 8)))

    intercept[Exception](P03.nth(0, List()))
    intercept[Exception](P03.nth(1, List()))
    intercept[Exception](P03.nth(1, List(0)))
    intercept[Exception](P03.nth(-1, List(0)))
  }

  "P04.length" should "return number of elements of list" in {
    assert(6 === P04.length(List(1, 1, 2, 3, 5, 8)))
  }

  "P05.reverse" should "reverse a list" in {
    assert(P05.reverse(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1))
  }

  "P06.isParindrome" should "return whether a list is a palindrome" in {
    assert(true === P06.isPalindrome(List(1, 2, 3, 2, 1)))
    assert(true === P06.isPalindrome(List(1, 2, 2, 1)))
    assert(false === P06.isPalindrome(List(1, 2, 3, 2, 6)))

  }

  "P07.flatten" should "return flatten a nested list structure" in {
    assert(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1, 1, 2, 3, 5, 8))
  }

  "P08.compress" should "eliminate consecutive duplicates of list elements" in {
    assert(P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      ===  List('a, 'b, 'c, 'a, 'd, 'e))
  }

  "P09.pack" should "pack consecutive duplicates of list elements into sublists" in {
    assert(P09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      === List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  "P10.encode" should "return Run-length encoding of a list" in {
    assert(P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      ===  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

  "P11.encodeModified" should "return Modified run-length encoding" in {
    assert(P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      === List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }

  "P12.decode" should "decode a run-length encoded list" in {
    assert(P12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
      === List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

  "P13.encodeDirect" should "return Run-length encoding of a list (direct solution)" in {
    assert(P13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      === List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

  "P14.duplicate" should "duplicate the elements of a list" in {
    assert(P14.duplicate(List('a, 'b, 'c, 'c, 'd)) === List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }

  "P15.duplicateN" should "duplicate the elements of a list a given number of times" in {
    assert(P15.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) === List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }

  "P16.drop" should "drop every Nth element from a list." in {
    assert(P16.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }

  "P17.split" should "split a list into two parts." in {
    assert(P17.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  "P18.slice" should "extract a slice from a list." in {
    assert(P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('d, 'e, 'f, 'g))
  }

  "P19.rotate" should "rotate a list N places to the left" in {
    assert(P19.rotate(3,  List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))
    assert(P19.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
  }

  "P20.removeAt" should "remove the Kth element from a list." in {
    assert(P20.removeAt(1, List('a, 'b, 'c, 'd)) === (List('a, 'c, 'd),'b))
  }

  "P21.insertAt" should "insert an element at a given position into a list." in {
    assert(P21.insertAt('new, 1, List('a, 'b, 'c, 'd)) === List('a, 'new, 'b, 'c, 'd))
  }

  "P22.range" should "create a list containing all integers within a given range." in {
    assert(P22.range(4, 9) === List(4, 5, 6, 7, 8, 9))

  }

  "P23.randomSelect" should "extract a given number of randomly selected elements from a list." in {
    val li = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    val res = P23.randomSelect(3, li)
    assert(res.length === 3)
    for (r <- res) assert(li.exists(r == _))
  }
}