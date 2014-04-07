object Kieli {
	def jos(ehto: Boolean)(tulos: => Unit) = if(ehto)tulos

	def kirjoita(p : Any){println(p)}

	def lue() : Int = readInt

	def toista(maara : Int)(p: => Unit) {for(i <- 0 to maara)p}

	def toistaEhdolla(ehto: => Boolean)(toiminto: => Unit) {while(ehto)toiminto}
}
