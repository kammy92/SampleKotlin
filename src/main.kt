object main {

    @JvmStatic
    fun main(args: Array<String>) {
        val int: Int = 100
        val double: Double = 100.00
        val float: Float = 100.00f
        val long: Long = 100
        val short: Short = 10
        val byte: Byte = 1
        val boolean: Boolean = true
        val string: String = "Hello"
        val char: Char = 'c'
        val rawString: String = """I am Raw String!
            Line 1
            Line 2
            Line 3"""
        val escapedString: String = "I am escaped String!\n" +
                "Line 1\n" +
                "Line 2\n" +
                "Line 3"
        val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5)


        println("Your Int Value is $int");
        println("Your Double  Value is $double");
        println("Your Float Value is $float");
        println("Your Long Value is $long");
        println("Your Short Value is $short");
        println("Your Byte Value is $byte");
        println("Your Boolean Value is $boolean");
        println("Your String Value is $string");
        println("Your Char Value is $char");
        println("Your Escaped String Value is $escapedString");
        println("Your Raw String Value is $rawString");
        println("Your IntArray Value is ${intArray.asList().toString()}")
        println("Your Hey!! I am array Example" + intArray.filter { i -> (i % 2 == 0) })


//        var person = Person("Karman")
//        print(person.fullName())
    }
}

class Person(fisrtName: String?, lastName: String?) {
    var firstName: String? = fisrtName
    var lastName: String? = null
    var age: Int? = null

    constructor(firstName: String) : this(firstName, null) {
        this.lastName = lastName;
    }

    init {
        age = 24;
    }

    fun fullName(): String {
        return "$firstName $lastName, Age : $age";
    }
}