package com.lessons.jetpackcompose

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(
    count: State<Int>,
    counter: () -> Unit,
) {
    val counterValue = count.value
    Text(
        text = "Clicks: $counterValue",
        modifier = Modifier.clickable(onClick = { counter() })
    )
}


//@Preview(showBackground = true)
//@Composable
//fun HomeScreenPreview() {
//    HomeScreen()
//}
class Counter {
    var value = 0
}