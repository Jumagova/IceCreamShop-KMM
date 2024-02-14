package org.company.app.core.presentation

import androidx.compose.runtime.Composable

@Composable
expect fun IceCreamTheme(
    darkTheme:Boolean,
    dynamicColor:Boolean,
    content: @Composable () -> Unit
)