package com.example.calculator.Lv4

fun main() {
    print("숫자를 입력하세요 : ")
    var a = readLine()!!.toInt()
    print("연산자를 입력하세요 : ")
    var oper = readLine()
    print("숫자를 입력하세요 : ")
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
