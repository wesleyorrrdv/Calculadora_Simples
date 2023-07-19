
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class mainTest {
private  val calculator = main()
    @Test
    fun add() {
        val result = calculator.add(2,3)
        assertEquals(5,result)
    }

    @Test
    fun sub() {
        val result = calculator.sub(5,2)
        assertEquals(3,result)
    }

    @Test
    fun mul() {
        val result = calculator.mul(4,3)
        assertEquals(12,result)
    }

    @Test
    fun div() {
        val result = calculator.div(10,2)
        assertEquals(5,result)
    }
}