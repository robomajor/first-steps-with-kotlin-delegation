interface SoundBehavior {         //Defines the interface SoundBehavior with one method.
    fun makeSound()
}

//The classes ScreamBehavior and RockAndRollBehavior implement the interface
// and contain their own implementations of the method.

class ScreamBehavior(val n:String): SoundBehavior {
    override fun makeSound() = println("${n.toUpperCase()} !!!")
}

class RockAndRollBehavior(val n:String): SoundBehavior {
    override fun makeSound() = println("I'm The King of Rock 'N' Roll: $n")
}


class TomAraya(n:String): SoundBehavior by ScreamBehavior(n)
//The classes TomAraya and ElvisPresley also implement the interface, but not the method.
// Instead, they delegate the method calls to the responsible implementation.
// The delegate object is defined after the by keyword.

class ElvisPresley(n:String): SoundBehavior by RockAndRollBehavior(n)