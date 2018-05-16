package kotlin_code/*
* It seems like the primary constructor is the only true constructor. It is the very first thing that gets called.
* You cannot do much in it besides initializing var and val.
* Any in class initialization (inline or block) is considered the body of this primary constructor.
* The other constructors' block comes in the very end.
* It's like attaching additional lines after the primary constructor and initializations.
* */



class Constructor(var i: Int) {

    init {
        println("First init block$i")
    }

    var num = i.also { n -> println("Init line: $n") }

    init {
        ++num
        println("Init block: $num")
    }

    constructor(i: Int, s: String) : this(i) {
        ++num
        println("kotlin.Constructor: $num")
    }
}

fun main(args: Array<String>) {
    val c = Constructor(1, "s")
    println(c.i)
    val d: String? = c as? String
    println(d)
}