package com.example.calculator.Lv4


class AddOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double = (num1 + num2).toDouble()
}

class SubOperation : AbstractOperation() {
    override fun operate(num1:Int, num2:Int) : Double = (num1 - num2).toDouble()
}

class MulOperation : AbstractOperation() {
    override fun operate(num1:Int, num2:Int) : Double = (num1 * num2).toDouble()
}

class DivOperation : AbstractOperation() {
    override fun operate(num1:Int, num2:Int) : Double = (num1 / num2).toDouble()
}