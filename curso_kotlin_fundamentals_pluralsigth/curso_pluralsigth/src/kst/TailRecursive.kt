package kst

import java.math.BigInteger

fun main(args: Array<String>) {
    println(fibonacci(500, BigInteger("1"), BigInteger("0")))
}

//Evitar um recursão "infinita" evitando erros...
tailrec fun fibonacci(n: Int, a: BigInteger, b:BigInteger): BigInteger {
    return if(n == 0) return b else fibonacci(n -1, a + b, a)
}