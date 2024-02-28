package com.example.calculatorapplication

sealed class CalculatorAction {
    data class Number(val value: Int) : CalculatorAction()
    data object Clear: CalculatorAction()
    data object Delete: CalculatorAction()
    data object Decimal: CalculatorAction()
    data object Calculate: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
}