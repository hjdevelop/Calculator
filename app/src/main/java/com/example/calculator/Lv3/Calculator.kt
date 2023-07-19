package com.example.calculator.Lv3


class Calculator {
    fun addOperation(num1:Int, num2:Int): Double {
        return AddOperation().operate(num1, num2)
    }

    fun subOperation(num1:Int, num2:Int): Double {
        return SubOperation().operate(num1, num2)
    }

    fun mulOperation(num1:Int, num2:Int): Double {
        return MulOperation().operate(num1, num2)
    }

    fun divOperation(num1:Int, num2:Int): Double {
        return DivOperation().operate(num1, num2)
    }
}