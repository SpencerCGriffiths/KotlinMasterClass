package s7_ExceptionHandling
import org.example.s7_ExceptionHandling.PowerSwitch
import org.example.s7_ExceptionHandling.State
import kotlin.test.*

class PowerSwitchTest {

    private val powerSwitch = PowerSwitch()

    @Test
    fun `assert initial power switch state to off`() {
        assertEquals(
            actual = powerSwitch.state,
            expected = State.Off,
            message = "initial power switch state to off"
        )
    }

    @Test
    fun `initial state off, trigger power switch, assert state on`() {
        assertEquals(
            actual = powerSwitch.state,
            expected = State.Off,
        )

        powerSwitch.trigger()

        assertEquals(
            actual = powerSwitch.state,
            expected = State.On
        )

    }

    @Test
    fun `initial state off, trigger power switch twice, assert state on`() {
        assertEquals(
            actual = powerSwitch.state,
            expected = State.Off,
        )

        powerSwitch.trigger()
        powerSwitch.trigger()

        assertEquals(
            actual = powerSwitch.state,
            expected = State.Off
        )

    }
}