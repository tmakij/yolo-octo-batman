import io.Source
import collection.immutable.HashMap
import annotation.tailrec

object Program {
	def main(args : Array[String]) {

		def read() : Array[String] = {
			val source = Source fromFile(args(0), "utf-8")
			val lines : Array[String] = source.getLines.toArray
			source.close
			return lines
		}
		
		def toDict(a : Array[String]) : Map[String, String] = {
			var m = new HashMap[String, String]
			for (i <- 0 until a.size by (2)) {
				val alku = a(i)
				val loppu = a(i + 1)
				m = m ++ Map(alku -> loppu)
			}
			return m
		}
		
		val dictionary = toDict(read)
		dictionary.foreach(println)
		println
		println("Anna sanoja (tyhja rivi lopettaa)")
		ask
		
		@tailrec def ask() : Unit = {
			val kysytty = readLine
			
			if (kysytty.isEmpty)
				println("Näkemiin!")
			else {
				if (dictionary contains kysytty)
					println(dictionary.get(kysytty).get)
				else
					println("VIRHE: En tunne sanaa " + kysytty)
				ask
			}
		}
	}
}
