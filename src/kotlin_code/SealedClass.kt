package kotlin_code

sealed class ScreenState {
    object Error : ScreenState()
    class Loading : ScreenState()
    data class Data(val someData: String) : ScreenState()
}

fun main(args: Array<String>) {
    val state1: ScreenState = ScreenState.Error
    val state2: ScreenState = ScreenState.Loading()
    val state3: ScreenState = ScreenState.Data("Hello")

    val state = state3
    when(state) {
        ScreenState.Error -> print("Error")
        is ScreenState.Loading -> print("Loading")
        is ScreenState.Data -> print("Data: ${state.someData}")
    }
}