package com.example.calculator.Lv3


class AddOperation{
    fun operate(num1: Int, num2: Int): Double = (num1 + num2).toDouble()
}

class SubOperation {
    fun operate(num1:Int, num2:Int) : Double = (num1 - num2).toDouble()
}

class MulOperation {
    fun operate(num1:Int, num2:Int) : Double = (num1 * num2).toDouble()
}

class DivOperation {
    fun operate(num1:Int, num2:Int) : Double = (num1 / num2).toDouble()
}