
    var doingSomething: Interface = object : Interface {
        override fun doSomething() {
            println("I have overridden the do something function of the interface")
        }
    }


interface Interface{
    fun doSomething()
}