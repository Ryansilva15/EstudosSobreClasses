package com.example.classesaninhadasnestedclassclassesinternasinnerclass.teste

class Motorista(val nome : String){
    fun exibirDadosMotorista() = println("Motorista : $nome")

    inner class Caminhão( val nomeCaminhao : String){
        fun exibirDadosCaminhao() = println("Caminhão: $nomeCaminhao motorista : $nome")
    }
}

fun main() {
    val motorista = Motorista("Jamilton")
    val caminhao = motorista.Caminhão("FH 60")
    caminhao.exibirDadosCaminhao()
}