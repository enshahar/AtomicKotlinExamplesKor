// IntroToGenerics/GenericListExtensions.kt
package introtogenerics
import atomictest.eq

fun <T> List<T>.first(): T {
  if (isEmpty())
    throw NoSuchElementException("Empty List")
  return this[0]
}

fun <T> List<T>.firstOrNull(): T? {
  return if (isEmpty()) null else this[0]
}

fun main(args: Array<String>) {
  listOf(1, 2, 3).first() eq 1

  val i: Int? =                     // [1]
    listOf(1, 2, 3).firstOrNull()
  i eq 1

  val s: String? =                  // [2]
    listOf<String>().firstOrNull()
  s eq null
}
