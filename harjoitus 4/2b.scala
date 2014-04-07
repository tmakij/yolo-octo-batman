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

final class Taltio {
	private var tallenteet = List[Tallenne]()
	
	override def toString : String = {
		var yhteensa = new MinSek
		var tulos = ""
		tallenteet.foreach { p =>
			yhteensa += p.getAika
			tulos += p + "\n"
		}
		tulos += "\nKokonaiskesto " + yhteensa + "\n"
		return tulos
	}
	
	def lisaaTallenne (t : Tallenne) = tallenteet = tallenteet :+ t
	
	def poistaTallenne (t : Tallenne) = tallenteet diff List(t)
}

final class Tallenne (kesto : Int, private val name : String) {
	private val aika = new MinSek(kesto)
	
	def getAika = aika
	
	override def toString : String = name + " " + aika
	override def equals (that : Any) : Boolean = {
		val thatT = that.asInstanceOf[Tallenne];
		return thatT.name == name;
	}
}

val a = new Taltio
val b = new Tallenne(123, "Tonttu ukot")
val c = new Tallenne(60, "HEI HEI")
a lisaaTallenne b
a lisaaTallenne c
println(a)
a poistaTallenne b
println(a)
