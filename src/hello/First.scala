package hello


object First {
  def main(args: Array[String]) {
    val one = new Rational(4,2)
    val two = new Rational(2,3)
    val sum = one add two
    printf(sum.toString)
    
    //第二次提交测试
    printf("修改！")
    //怎么不行了
    printf("ceshi")
  }
}