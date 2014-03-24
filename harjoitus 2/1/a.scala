import collection.mutable.ArrayBuffer

val l = List(-3,-2,-1,0,0,1,2,3,4)
println("Alkuperäinen " + l)

val pos = l count(p => p > 0)
println("Positiivisia lukuja: " + pos)

val exs = l exists(p => p < 1 && p > -1)
println("Listassa on epänegatiivinen ja epäpositiivnen luku: " + exs)

val neg_list = l filter(p => p < 0)
println("Negatiivinen " + neg_list)

val absolute = l forall(p => Math.abs(p) <= 3)
println("Lukujen itseisarvo on alle 4: " + absolute)

l foreach (p => {val y = Math.sin(p * Math.PI);println(y)})

val str_list = l map(p => (p*p*p).toString)
println(str_list)

val arrbuf = new ArrayBuffer() ++ l.toBuffer
arrbuf.remove(3)
arrbuf.remove(3)
println("Nollat pois: " + arrbuf)
