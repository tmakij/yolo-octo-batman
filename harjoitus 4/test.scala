import Kieli._


object Main extends App{

// Ohjelmointiesimerkki:

jos (1<2) {kirjoita("kissa")}   // Aaltosulkeet ovat pakolliset!

Kieli.kirjoita(1+2)
Kieli.kirjoita(1<2)

kirjoita("Montako onnittelua?")
var onLkm = lue
toista (onLkm) {kirjoita("Onnea!")}

var lkm = 6
toistaEhdolla (lkm > 0) {kirjoita(lkm); lkm -= 1}

kirjoita("Mihin saakka tutkitaan lukujen parillisuutta?")
var montako = lue

lkm = 1
toistaEhdolla (lkm <= montako) {
  jos (lkm % 2 == 0) {
    kirjoita(lkm + " on parillinen")
  }
  lkm += 1
}

kirjoita("Lasketaan lukujen summa a:sta b:hen:")
kirjoita("Anna a")
var a = lue
kirjoita("Anna b")
var b = lue

jos (a>b) {
  var apu = a
  a = b
  b = apu
}
var summa = 0
var laskuri = a
toistaEhdolla (laskuri <= b) {
  summa += laskuri
  laskuri += 1
}
kirjoita("Lukujen summa " + a + " ... " + b + " on " + summa)

}
