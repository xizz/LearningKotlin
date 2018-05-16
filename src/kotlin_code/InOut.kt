package kotlin_code

class Source<in I, out O>(private var inputData: I, private var outputData: O) {

    fun setInputData(obj: I) {
        inputData = obj
    }

    fun getOutput() : O {
        return outputData
    }

    override fun toString(): String {
        return "$inputData $outputData"
    }
}

fun main(args: Array<String>) {
    var s1 = Source<CharSequence, CharSequence>(StringBuilder().append("Input"), StringBuilder().append("Output"))
    println(s1)

    var o1 : CharSequence = s1.getOutput()
    var o2 : Any = s1.getOutput()
//    var o3 : StringBuilder = s1.getOutput()

    s1.setInputData("Input")
    s1.setInputData(StringBuilder().append("Input"))
//    s1.setInputData(Any())
}