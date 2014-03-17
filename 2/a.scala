import util.Random

val rand = new Random
val koneenLuku = rand.nextInt(10)

val eka = readInt
val toka = readInt
val kolmas = readInt

var voitto = 0
var tulos = "Sait "

if (eka == koneenLuku)
	voitto += 400
if (toka == koneenLuku)
	voitto += 200
if (kolmas == koneenLuku)
	voitto += 100

if (voitto == 0) {
	voitto = 400
	tulos = "Menetit "
}

println(tulos + voitto + " virtuaalieuroa")
println("Koneen luku oli " + koneenLuku)
