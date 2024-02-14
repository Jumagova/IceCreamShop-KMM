package org.company.app.core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.company.app.theme.DarkColorScheme
import org.company.app.theme.LightColorScheme
import org.company.app.theme.Typography

@Composable
actual fun IceCreamTheme(
    darkTheme:Boolean,
    dynamicColor:Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}

