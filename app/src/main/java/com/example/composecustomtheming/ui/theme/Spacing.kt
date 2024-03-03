package com.example.composecustomtheming.ui.theme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Spacing(
    val default:Dp = 0.dp,
    val extraSmall: Dp = 4.dp,
    val small:Dp = 8.dp,
    val medium:Dp = 16.dp,
    val large:Dp = 32.dp,
    val extraLarge:Dp = 64.dp
)
//Composition Local
val LocalSpacing = compositionLocalOf { Spacing() }

//Add Spacing to MaterialTheme
val MaterialTheme. Spacing: Spacing
    @Composable
    @ReadOnlyComposable
    get() = LocalSpacing.current