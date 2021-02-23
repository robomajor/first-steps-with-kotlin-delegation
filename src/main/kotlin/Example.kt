import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()        //Delegates property p of type String to the instance of class Delegate.
                                        // The delegate object is defined after the by keyword.

    override fun toString() = "Example Class"
}

class Delegate() {
    //Delegation methods. The signatures of these methods are always as shown in the example.
    // Implementations may contain any steps you need. For immutable properties only getValue is required.

    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}