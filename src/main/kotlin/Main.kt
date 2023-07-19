import java.lang.IllegalArgumentException

class main() {
    fun add(a: Int, b:Int):Int{
        return a + b

    }

    fun sub(a:Int,b:Int):Int{
        return a - b
    }

    fun mul(a:Int, b:Int):Int{
        return a * b
    }

    fun div(a:Int, b:Int):Int{
        if (b == 0)
            throw IllegalArgumentException("Resutaldo: Zero")
        return a / b
    }

}