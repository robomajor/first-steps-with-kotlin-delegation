fun main() {
    val tomAraya = TomAraya("Thrash Metal")
    tomAraya.makeSound()             //When makeSound() is called on tomAraya of type TomAraya or elvisPresley
                            // of type ElvisPresley, the call is delegated to the corresponding delegate object.

    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvisPresley.makeSound()

    val e = Example()
    println(e.p)
    e.p = "NEW"

    val sample = LazySample()         //Property lazy is not initialized on object creation.
    println("lazyStr = ${sample.lazyStr}")  //The first call to get() executes the lambda expression passed to lazy() as an argument and saves the result.
    println(" = ${sample.lazyStr}")  //Further calls to get() return the saved result.

    val user = User(mapOf(
        "name" to "John Doe",
        "age"  to 25
    ))

    println("name = ${user.name}, age = ${user.age}")
}