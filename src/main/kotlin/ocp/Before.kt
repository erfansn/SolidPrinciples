package ocp

class Calculator {
    
    sealed class Button(val symbol: String) {
        object Digit : Button("")
        object Operator : Button("")
        object Function : Button("")
    }

    fun onClick(button: Button) {
        when (button) {
            Button.Digit -> TODO()
            Button.Function -> TODO()
            Button.Operator -> TODO()
        }
    }
}
