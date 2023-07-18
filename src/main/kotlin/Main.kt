import java.lang.IllegalArgumentException

class main() {
    fun add(a: Int, b:Int):Int{
        return a + b

    }

    fun sub(c:Int,d:Int):Int{
        return c - d
    }

    fun mul(e:Int, f:Int):Int{
        return e * f
    }

    fun div(g:Int, h:Int):Int{
        if (h == 0)
            throw IllegalArgumentException("Resutaldo: Zero")
        return g / h
    }

}