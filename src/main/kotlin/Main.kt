fun main() {
    // Menu ////////////////////////////////////////////////////////////////////////////////////////////////////
    println("***  ATIVIDADES  ***")
    println("")
    println("1: Qual o Triângulo?\n2: O ano é Bissexto?\n3: Você é o criminoso?\n4: Combustíveis\n5: Sair")
    println("")
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    val choose = readLine()!!.toInt()

    when(choose){

        1 -> {atividadeTriangulos()}
        2 -> {atividadeAnoBissexto()}
        3 -> {atividadeCrime()}
        4 -> {atividadeCombustiveis()}
        5 -> {println("Adeus!! :)")}
    }
}
/////////////////////////////////////////////////////////////////////
fun atividadeTriangulos(){
    println("Digite o valor do lado 1: \n")
    val lado1 = readLine()!!.toFloat()
    println("Digite o valor do lado 2: \n")
    val lado2 = readLine()!!.toFloat()
    println("Digite o valor do lado 3: \n")
    val lado3 = readLine()!!.toFloat()
    triangulos(lado1, lado2, lado3)
}

fun triangulos(lado1: Float, lado2: Float, lado3: Float){
        if(lado1 == lado2 && lado1 == lado3){
            println("É um Triângulo Equilátero")
        }
        else if(lado1 != lado2 && lado1 != lado3){
            println("É um Triângulo Escaleno")
        }
        else{
            println("É um Triângulo Isoceles")
        }
}
/////////////////////////////////////////////////////////////////////
fun atividadeAnoBissexto(){
    println("Digite o ano: \n")
    val ano = readLine()!!.toInt()
    anoBissexto(ano)
}

fun anoBissexto(ano: Int){
    if(ano %4 == 0 && ano %100 != 0){
        println("$ano é um ano Bissexto!!")
    }
    else if(ano %4 == 0 && ano %100 == 0 && ano %400 == 0){
        println("$ano é um ano Bissexto!!")
    }
    else {
        println("$ano não é um ano Bissexto.")
    }
}
/////////////////////////////////////////////////////////////////////
fun atividadeCrime(){
    println("Você ligou para a vítima?")
    println("1: Sim\n2: Não")
    val respostaTelefonema = readLine()!!.toInt()
    println("Você esteve no local do crime?")
    println("1: Sim\n2: Não")
    val respostaLugar = readLine()!!.toInt()
    println("Você mora perto da vítima?")
    println("1: Sim\n2: Não")
    val respostaMoradia = readLine()!!.toInt()
    println("Você devia para a vítima?")
    println("1: Sim\n2: Não")
    val respostaDever = readLine()!!.toInt()
    println("Você já trabalhou com a vítima?")
    println("1: Sim\n2: Não")
    val respostaEmprego = readLine()!!.toInt()
////////////////////////////////////////////////////////////////////
    var respostaSim: Int = 0

    if(respostaTelefonema == 1){respostaSim ++}

    if(respostaLugar == 1){respostaSim ++}

    if(respostaMoradia == 1){respostaSim ++}

    if(respostaDever == 1){respostaSim ++}

    if(respostaEmprego == 1){respostaSim ++}

    crime(respostaSim)

}

fun crime(sim: Int){
    if(sim == 2){
        println("U sus 🤠")
    }
    else if(sim == 3 || sim == 4){
        println("Tu é cúmplice :0")
    }
    else if(sim == 5){
        println("Murderererererrrrrrrrrrr aaaaaaaaa")
    }
    else{
        println("Inocentado")
    }
}
/////////////////////////////////////////////////////////////////////
fun atividadeCombustiveis(){
    println("Escolha qual tipo de combustível você quer\n")
    println("G: Gasolina(R$ 6,99/L)\nA: Álcool (R$ 4,99/L)\n")
    val choose = readLine()!!.toString()

    println("Quanto deseja coloar?\n")
    val litros = readLine()!!.toFloat()

    if(litros > 20 && choose == "G"){
        val pagamento = (litros * 6.99) - (litros * 6.99 * 0.06)
        println("O valor a ser pago é $pagamento")
    }else if(litros <= 20 && choose == "G"){
        val pagamento = (litros * 6.99) - (litros * 6.99 * 0.04)
        println("O valor a ser pago é $pagamento")
    }

    if(litros > 20 && choose == "A"){
        val pagamento = (litros * 4.99) - (litros * 4.99 * 0.05)
        println("O valor a ser pago é $pagamento")
    }else if(litros <= 20 && choose == "A"){
        val pagamento = (litros * 4.99) - (litros * 4.99 * 0.03)
        println("O valor a ser pago é $pagamento")
    }
}