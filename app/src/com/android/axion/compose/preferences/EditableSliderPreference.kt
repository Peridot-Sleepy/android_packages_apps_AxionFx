package com.android.axion.compose.preferences

import android.graphics.drawable.Drawable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun EditableSliderPreference(
    title: String,
    summary: String = "",
    value: Float,
    onValueChange: (Float) -> Unit,
    onValueChangeFinished: () -> Unit = {},
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    steps: Int = 0,
    displayValue: String = "",
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    customIcon: @Composable (() -> Unit)? = null,
    iconDrawable: Drawable? = null,
    iconTint: Color? = null,
    iconBackgroundColor: Color? = null,
    enabled: Boolean = true,
    position: PreferencePosition = LocalPreferencePosition.current,
    onReset: (() -> Unit)? = null,
    onValueClick: (() -> Unit)? = null,
) {
    SliderPreference(
        title = title,
        summary = summary,
        value = value,
        onValueChange = onValueChange,
        onValueChangeFinished = onValueChangeFinished,
        valueRange = valueRange,
        steps = steps,
        displayValue = displayValue,
        modifier = modifier,
        enabled = enabled,
        position = position,
        onReset = onReset,
    )
}
