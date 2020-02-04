object Zero extends Nat {
  def isZero = true
  def predecessor = throw new Error("zero doesn't have predecessor")
  def +(that: Nat) = that
  def -(that: Nat) = if (that.isZero) this else throw new Error("negative number")
}