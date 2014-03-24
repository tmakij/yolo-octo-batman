final class Complex (private val Rel : BigDecimal, private val Img : BigDecimal) {
	
	
	def +(other:Complex) = new Complex(Rel + other.Rel, Img + other.Img)
	def unary_- = new Complex(-Rel, -Img)
	def -(other:Complex) = this + ( -other )
	def *(other:Complex) = new Complex(Rel * other.Rel - Img * other.Img, Rel * other.Img + other.Rel * Img)
	def reciprocal = new Complex((Rel/(Rel.pow(2) + Img.pow(2))), (-Img/(Rel.pow(2)+ Img.pow(2)))) 
	def /(other:Complex) = this * (other.reciprocal)
	
	override def toString = {
		var p = "+"
		if (Img.signum == -1)
			p = ""
		Rel + p + Img + "i"
	}
}

val c = new Complex(-5, 2);
val c2 = new Complex(10, -5);
println(c + c2)
println(-c)
println(c - c2)
println(c * c2)
println(c.reciprocal)
println((c.reciprocal).reciprocal)
println(c / c2)
