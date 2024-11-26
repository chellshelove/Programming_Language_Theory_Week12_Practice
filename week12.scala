object Week12 extends App {

  def display(a: Any, b: Any, c: Any) = {
    println(f"$a%-5s $b%-5s $c%-5s")
  }
  display("A", "B", "Eval")

  // Implementation of logical functions
  def not(a: Boolean): Boolean = !a
  def and(a: Boolean, b: Boolean): Boolean = a && b
  def or(a: Boolean, b: Boolean): Boolean = a || b

  def truthTable(e: (Boolean, Boolean) => Boolean): Unit = {
    val inputs = List((true, true), (true, false), (false, true), (false, false))
    for ((a, b) <- inputs) {
      val result = e(a, b)
      display(a, b, result)
    }
  }

  // Calling truthTable with the logical expression (!a && b) || (a && !b)
  truthTable((a, b) => or(and(not(a), b), and(a, not(b))))
}