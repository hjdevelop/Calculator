package com.example.calculator.Lv1

fun main() {
    var a = readLine()!!.toInt()
    var oper = readLine()
    var b = readLine()!!.toInt()

    val cal = Calculator()

    if(oper == "+") {
        cal.add(a, b)
    }
    else if(oper == "-") {
        cal.sub(a, b)
    }
    else if(oper == "*") {
        cal.mul(a, b)
    }
    else if(oper == "/") {
        cal.div(a, b)
    }
    else {
        println("연산자가 잘못되었습니다. 다시 입력해주세요.")
    }
}

class Calculator() {
    fun add(a:Int, b:Int) {
        println(a + b)
    }

    fun sub(a:Int, b:Int) {
        println(a - b)
    }

    fun mul(a:Int, b:Int) {
        println(a * b)
    }

    fun div(a:Int, b:Int) {
        println(a / b)
    }
}