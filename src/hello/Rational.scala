package hello

class Rational(n:Int,d:Int) {
  require(d!=0)
  private val g = gcd(n.abs,d.abs)
  val numer : Int = n/g
  val denom : Int = d/g
  override def toString= n+"/"+d
  def this(n:Int)=this(n,1)
  def add(that:Rational):Rational=
    new Rational(
    	numer *that.denom + that.numer *denom ,
    	denom *that.denom 
    )
  private def gcd(a:Int,b:Int):Int=
    if(b==0) a else gcd(b,a%b)
}