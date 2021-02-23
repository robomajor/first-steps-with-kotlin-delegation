class User(val map: Map<String, Any?>) {
    val name: String by map                //Delegates take values from the map by the
    val age: Int     by map                //string keys - names of properties.
}