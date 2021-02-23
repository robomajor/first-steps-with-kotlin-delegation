class LazySample {
    init {
        println("created!")            //Property lazy is not initialized on object creation.
    }

    val lazyStr: String by lazy {
        println("computed!")          //The first call to get() executes the lambda expression passed to lazy()
        "my lazy"                               // as an argument and saves the result.
    }
}