package main.scala.study

/**
 * @create: 2022-11-24 14:36
 * @description:
 **/
object MatchDemo {

  def main(args: Array[String]): Unit = {
    println(matchTest(1))
    println(matchTest(2))
    println(matchTest(3))
    println(matchTest("test"))
    println(matchTest("just a test"))
  }

  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case 2 => "two"
    case Int => "int type"
    case "test" => "the same"
    case _ => "other"
  }
}

// 样例类
case class Person(name: String, age: Int)

object caseObjectTest {
  def main(args: Array[String]): Unit = {
    val Bob = Person("Bob", 32)
    val alice = Person("Alice", 25)
    val wang = Person("wang", 15)

    val personList = List(Bob, alice, wang)
    for (person <- personList) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) =>
          println("Age: " + age + " year, name: " + name + " ?")
      }
    }
  }
}
