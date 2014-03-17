import util.control.Breaks._

val alku = readInt
val loppu = readInt

val pieninEnsin = alku < loppu
val muutos = if (pieninEnsin) 1 else -1
var nykyinen = alku

breakable {
	while (true) {
		printKarkausvuosi(nykyinen)
		nykyinen += muutos
		if (loppu == nykyinen) {
			break
		}
	}
}

def printKarkausvuosi(vuosi : Int) {
	if (vuosi % 4 == 0 && (vuosi % 100 != 0 || (vuosi % 100 == 0 && vuosi % 400 == 0))) {
		println(vuosi)
	}
}
