fun main(args: Array<String>) {
//    to access the inner class members without creating inner class object
    val obj = NestedClass().Innerclass()
    println(obj.inner())
    
//    create inner class object
    val innerobj = NestedClass().Innerclass()
    println(innerobj.inner())

//    Anonymous classes which are created on runtime
    doingSomething.doSomething()
}