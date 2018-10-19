val nums = Seq(1, 34, 5, 7, 98, 90, 6, 54)

val a = Array(10, 54, 6, 87, 3, 2, 67, 734, 3, 346, 0, 1, 32)

for (i <- 0 until a.length) a(i) = i * i

import scala.collection.mutable.ArrayBuffer
val b = ArrayBuffer("Mary", "had", "a", "little")

b += "its"

b ++= Array("as", "snow")

b.remove(3)

b.insert(3, "medium")

b.trimEnd(1)

val c = for (el <- nums if el % 2 != 0) yield 4 * el

val sum = Array(1, 7, 8, 9).sum

val maxString = ArrayBuffer("Mary", "had", "a", "little", "lamb", "it", "was", "white", "as", "snow").max

val sortedNums = ArrayBuffer(3, 45, 653, 3, 4, 52, 5, 45, 45, 435, 35, 7, 8, 98, 4, 32, 25, 2).sorted

val reverseNums = ArrayBuffer(1, 3, 5, 9, 2).reverse

