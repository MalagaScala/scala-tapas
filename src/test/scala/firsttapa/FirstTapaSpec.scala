import org.scalatest._
import collection.mutable.Stack

// source: http://www.scalatest.org/quick_start

class FirstTapaSpec extends FlatSpec with Matchers {

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.pop() should be (2)
    stack.pop() should be (1)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new Stack[Int]
    a [NoSuchElementException] should be thrownBy {
      emptyStack.pop()
    }
  }

  // assertions example
  "Assertions" should "be used" in {
    assert(1 == 1)
    assert(Some(2).isDefined)
    //assert(Some(2).isEmpty)
  }
}
