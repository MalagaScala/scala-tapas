package scalatapas

import scalatapas.Example
import org.scalatest._

class ExampleTest extends FlatSpec with Matchers {
  it should "echo a message" in {
    val message = "This is a test"
    val example = Example(message)
    example.echo should be (message)
  }
}
