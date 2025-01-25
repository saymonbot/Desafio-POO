data class Pais(var habitantes: Double, var taxaCrescimento: Double) {
  fun crescerPopulacaoAnual() {
      habitantes += habitantes * taxaCrescimento
  }
}

fun main() {
  var habitantesPaisA = readLine()!!.toDouble();
  var habitantesPaisB = readLine()!!.toDouble();
  
  var paisA = Pais(habitantesPaisA, taxaCrescimento = 0.03)
  var paisB = Pais(habitantesPaisB, taxaCrescimento = 0.015)
  
  var quantidadeAnos = 0
  while (paisA.habitantes < paisB.habitantes) {
    paisA.crescerPopulacaoAnual()
    paisB.crescerPopulacaoAnual()
    quantidadeAnos++;
  }
  
  println("$quantidadeAnos anos")
}
