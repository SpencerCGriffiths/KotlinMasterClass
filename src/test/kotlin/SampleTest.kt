import kotlin.test.* // import everything from Kotlin test

class SampleTest {

    private val actualNumber = 30
    @Test // <-Converts a regular function in to a test function
    fun testTheNumber() {
        assertEquals(
            expected = 30,
            actual = actualNumber,
            message = "Incorrect Number,"
        )
    }

    @Test
    fun testTheNumberAssertTheError() {
        assertEquals(
            expected = 29,
            actual = actualNumber,
            message = "Incorrect Number,"
        )
    }
    /**
    Test Fails with this output:
    Incorrect Number,
    Expected :29
    Actual   :30
     */

    fun calculate(number1: Int, number2: Int): Int {
        return number1 / number2
    }

    @Test
    fun `calculate, pass zero, assert an error`() { // <- using backticks to name
        assertFails {//<- assert and confirm the block will fail
            calculate(number1 = 100, number2 = 0) // <- Cannot divide by 0, so will throw an excep and fail
        }
    }
    @Test
    fun `calculate, assert correct result`() { // <- using backticks to name
        assertIs<Int>( //<- assert and confirm the result is an Int
            value = calculate(number1 = 100, number2 = 2) )
    }
}