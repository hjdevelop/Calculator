package com.example.calculator.Lv3

fun main() {
    var a = readLine()!!.toInt()
    var oper = readLine()
    var b = readLine()!!.toInt()

    val calc = Calculator()

    if(oper == "+") {
        println("해당 연산 결과는 ${calc.addOperation( a, b)} 입니다")
    }
    else if(oper == "-") {
        println("해당 연산 결과는 ${calc.subOperation( a, b)} 입니다")
    }
    else if(oper == "*") {
        println("해당 연산 결과는 ${calc.mulOperation( a, b)} 입니다")
    }
    else if(oper == "/") {
        println("해당 연산 결과는 ${calc.divOperation( a, b)} 입니다")
    }
    else {
        println("연산자가 잘못되었습니다. 다시 입력해주세요.")
    }
}
