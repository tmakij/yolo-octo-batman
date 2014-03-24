import io.Source
import util.control.Breaks._

object Program {
	def main(args : Array[String]) {
	
		val file = args(0)
		val source = Source fromFile(file, "utf-8")
		val srclines = source.getLines
		val lines : Array[String] = srclines.toArray
		source.close
		
		breakable {
			while (true) {
				val haettu = readLine
				if (haettu.isEmpty)
					break
				for (s <- lines) {
					if (s contains haettu)
						println(s)
				}
			}
		}
	}
}
