class Succ(n: Nat) extends Nat {
  def isZero = false
  def predecessor: Nat = n
  def +(that: Nat) = new Succ(n + that)
  def -(that: Nat): Nat = if(that.isZero) this else n - that.predecessor
}