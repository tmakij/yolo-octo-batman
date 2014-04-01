final class MinSek (min : Int, sek : Int){
	def this(sek : Int) = this(0, sek)
	def this() = this(0, 0)
	
	private val time = (min * 60) + sek
	
	def +(that : MinSek) = new MinSek(time + that.time)
	def -(that : MinSek) = new MinSek(time - that.time)
	def unary_-() = new MinSek(-time)
	def *(m : Int) = new MinSek(time * m)
	def /(d : Int) = new MinSek(time / d)
	
	override def toString = getMinFormat + ":" + getSekFormat
	
	private def getMin = (time - getSek) / 60
	private def getSek = time % 60
	
	private def getMinFormat : String = {
		val min = getMin
		if (min == 0 && getSek < 0) return "-0"
		return min.toString
	}
	private def getSekFormat : String = {
		val s = Math.abs(getSek)
		if (s < 10) return "0" + s
		return s.toString
	}
}



// konstruointi ja negatiiviset parametrit
var a = new MinSek(2,11)
println(a)               // 2:11
a = new MinSek(2,-11)
println(a)               // 1:49
a = new MinSek(-2,11)
println(a)               // -1:49
a = new MinSek(-2,-11)
println(a)               // -2:11

a = new MinSek(66)
println(a)               // 1:06   Huom: sekunnit siis aina 2 numerolla!
a = new MinSek
println(a)               // 0:00
println(new MinSek(-21)) // -0:21
a = new MinSek(1,601)
println(a)               // 11:01

// infix operaatiot + ja - kahdelle MinSek-arvolle
val b = new MinSek(2,45)
val c = new MinSek(49)
println(b + " ja " + c)  // 2:45 ja 0:49
a = b + c
println(a)               // 3:34
println(b - c)           // 1:56
println(c - b)           // -1:56
println(b - c + a)       // 5:30
println(b - a)           // -0:49

// infix-operaatiot * ja / MinSek-arvolle ja kokonaisluvulle
a = new MinSek(2,11)
println(a)               // 2:11
println(a * 2)           // 4:22
println(a / 2)           // 1:05

println(a * -2)           // -4:22
println(a / -2)           // -1:05

// prefix-operaatio - vastaluvun laskentaan
println(-a)               // -2:11
println(-(-a))            // 2:11

