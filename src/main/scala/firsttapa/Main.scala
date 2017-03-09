package firsttapa

// 1. conventional way
object FirstTapa {
  def main(args: Array[String]): Unit = {
    println("Hello to the world of Scala!")
  }
}

// 2. scala way
// The App trait can be used to quickly turn objects into executable programs
// http://www.scala-lang.org/api/current/scala/App.html
// object FirstTapa extends App {
//   println("Hello to the world of Scala!")
// }

// 3. with args
// When using this approach, any command-line arguments to your application are implicitly
// available through an args object, which is inherited from the App trait
// object FirstTapa extends App {
//   if (args.length == 1) println(s"Hello, ${args(0)}")
//   else println("I didn't get your name.")
// }
