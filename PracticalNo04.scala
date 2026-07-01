import breeze.linalg._
object SparseDenseOperations {
  def main(args: Array[String]): Unit = {
    val sparseVector = SparseVector.zeros[Double](10)
    sparseVector(0) = 10.0
    sparseVector(3) = 25.0
    sparseVector(5) = 15.0
    sparseVector(8) = 30.0
    println("Sparse Vector:")
    println(sparseVector)
    val denseVector = sparseVector.toDenseVector
    println("\nDense Vector:")
    println(denseVector)
    val anotherVector = DenseVector(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)
    println("\nAnother Dense Vector:")
    println(anotherVector)
    val sum = breeze.linalg.sum(denseVector)
    val mean = sum / denseVector.length
    val dot = denseVector.dot(anotherVector)
    println("\nSum = " + sum)
    println("Mean = " + mean)
    println("Dot Product = " + dot)
  }
}