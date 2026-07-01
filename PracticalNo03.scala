import scala.util.Random

object VarianceAndStdDev {
  def main(args: Array[String]): Unit = {

    val data = List.fill(10)(Random.nextInt(100) + 1)

    println("Dataset: " + data)

    val mean = data.sum.toDouble / data.length

    val variance = data.map(x => math.pow(x - mean, 2)).sum / data.length

    val stdDev = math.sqrt(variance)

    println(f"Mean = $mean%.2f")
    println(f"Variance = $variance%.2f")
    println(f"Standard Deviation = $stdDev%.2f")
  }
}