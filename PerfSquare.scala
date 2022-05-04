import scala.io.StdIn
import scala.io.StdIn.{ readLine, readInt }

object PerfSquare {

  def main(args: Array[String]) {
    //taking numbers of customers input
    val NumCustomers: Int = readInt()

    //taking second line as input
    val BillAmount = readLine()

    val billAmt = BillAmount.split(" ").map(_.toInt)

    var count = 0
    for (i <- billAmt) {
      val sqrt = Math.sqrt(i)
      if (sqrt.ceil - sqrt == 0) {
        count = count + 1
      }
    }
    println(count)

  }
}