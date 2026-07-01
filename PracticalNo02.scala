object StatisticsCalculator {
  def main(args: Array[String]): Unit = {
    val numbers = List(10, 20, 30, 40, 50, 20, 30, 20)
    val mean = numbers.sum.toDouble / numbers.length
    val sorted = numbers.sorted
    val n = sorted.length
    val median =
      if (n % 2 == 0)
        (sorted(n / 2 - 1) + sorted(n / 2)).toDouble / 2
      else
        sorted(n / 2)

    val frequency = numbers.groupBy(identity).view.mapValues(_.size).toMap
    val maxFreq = frequency.values.max
    val mode = frequency.filter(_._2 == maxFreq).keys.toList

    println("Numbers: " + numbers)
    println("Mean = " + mean)
    println("Median = " + median)
    println("Mode = " + mode.mkString(", "))
  }
}