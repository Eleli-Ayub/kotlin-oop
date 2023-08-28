class NestedClass {
    private val outerClassText: String = "This is the outer class"

    inner class Innerclass{
        fun inner() = outerClassText
    }
}