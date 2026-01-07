package org.example.s7_ExceptionHandling

sealed class State {
    object On: State()
    object Off: State()
}

class PowerSwitch {
    var state: State = State.Off
    private set // <- can only change inside this class


    fun trigger()  { // <- switches the state of the switch
        state = when(state) {
            is State.On -> State.Off
            is State.Off -> State.On
        }
    }

}