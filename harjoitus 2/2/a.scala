final class Viisari (private val max : Int) {
	require(max > 0)
	var aika = 0
	def etene() = {
		aika += 1
		if (aika >= max)
			aika = 0
		}
	
	def getAika = aika
	
	override def toString = aika.toString
}

final class Sekuntilaskuri () {
	val sek = new Viisari(60)
	val min = new Viisari(60)
	val tun = new Viisari(24)
	
	def getSekunnit = sek.getAika
	def getMinuutit = min.getAika
	def getTunnit = tun.getAika
	
	def lisaaSekuntti : Unit = {
		sek.etene
		if (getSekunnit == 0) {
			min.etene
			if (getMinuutit == 0) {
				tun.etene
			}
		}
	}
	
	override def toString = tun + ":" + min + ":" + sek
}
def Sekuntilaskuri = new Sekuntilaskuri

val s = Sekuntilaskuri

def printLaskuri(i : Int) : Unit = {
	for (i <- 0 until i)
		s.lisaaSekuntti
	println(s)
}
def printOsat = println("Sekunnit: " + s.getSekunnit + " Minuutit: " + s.getMinuutit + " Tunnit: " + s.getTunnit)

printLaskuri(1)
printLaskuri(60*60*3)
printOsat
printLaskuri(60*60*15)
printLaskuri(60*60*5 + 60*59 + 58)
printOsat
printLaskuri(1)
printOsat
