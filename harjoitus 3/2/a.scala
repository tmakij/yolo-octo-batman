def isPrime(n : Int) : Boolean = {
	if (n == 2) return true
	for (i <- 2 until n) {
		if (n % i == 0) return false
	}
	return true
}

def primesStart(n : Int) = {
	return {
		for (i <- 1 to 30) {
			if (isPrime(i)) {
				i
			}
		}
	}
}

val nm (n : Int) = {
		for (i <- 1 to 30) {
			if (isPrime(i)) {
			}
		}
	}

val m = primesStart(_)

m(32)

println(m)
