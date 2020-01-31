package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    true
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    if (array.isEmpty) { false }
    else if (array.head == elem) { true }
    else { linearSearch(array.tail, elem)}
    true
  }


}
