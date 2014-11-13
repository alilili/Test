package hello


object First {
  def main(args: Array[String]) {
    val one = new Rational(4,2)
    val two = new Rational(2,3)
    val sum = one add two
    printf(sum.toString)
  }
}