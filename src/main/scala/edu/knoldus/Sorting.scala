package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    for(i <- 1 to  array.length-1)
    {
      val element = array(i)
      var j=i

      while(j>0 && array(j-1)>element)
      {
        array(j)=array(j-1)
        j=j-1
      }
      array(j) = element
    }
    array
  }



  def selectionSort(array: Array[Int]): Array[Int] = {
    for (i <- 0 to array.length-2) {
      var min = array(i)
      var position = i
      for (j <- i to array.length-1)
        if (min > array(j)) {
          min = array(j)
          position = j
        }
      if (array(i) != min) {
        val temp = array(position)
        array(position) = array(i)
        array(i) = temp

      }
    }

    array
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {

    for (i <-0 until array.length-1) {
      for (j <- 0 until array.length - 1 - i) {
        if (array(j) > array(j + 1)) {


          val temp = array(j)
          array(j) = array(j + 1)
          array(j + 1) = temp
        }
      }
    }
array
  }
}
