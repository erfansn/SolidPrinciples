package ocp

class AmendedCalculator {

    class Evaluator

    sealed class Button(val symbol: String) {
        object Digit : Button("") {
            override fun invoke() = Unit
        }
        object Operator : Button("") {
            val applier: (String) -> String = { it }

            override fun invoke() = Unit
        }
        object Function : Button("") {
            lateinit var evaluator: Evaluator

            override fun invoke() = Unit
        }

        abstract operator fun invoke()
    }

    fun onClick(button: Button) {
        button()
    }
}
