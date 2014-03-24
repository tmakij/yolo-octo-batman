val koko = readInt
printKolmio(koko)

def printTahtia(maara : Int) {
	printStr("*", maara)
	println()
}
def printTyhjaa(maara : Int) {
	printStr(" ", maara)
}

def printStr(s : String, lim : Int) {
	var i = 0
	while (i < lim) {
		print(s)
		i += 1
	}
}

def printKolmio(koko : Int) {
	var i = 0
	while (i < koko) {
		printTyhjaa(koko - 1 - i)
		printTahtia(2 * i + 1)
		i += 1
	}
}
