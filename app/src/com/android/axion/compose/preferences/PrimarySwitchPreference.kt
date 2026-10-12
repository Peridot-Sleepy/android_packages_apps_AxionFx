package com.android.axion.compose.preferences

import android.graphics.drawable.Drawable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Switch
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun PrimarySwitchPreference(
    title: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    summary: String? = null,
    icon: ImageVector? = null,
    customIcon: @Composable (() -> Unit)? = null,
    iconDrawable: Drawable? = null,
    enabled: Boolean = true,
    iconTint: Color? = null,
    iconBackgroundColor: Color? = null,
    position: PreferencePosition = LocalPreferencePosition.current,
) {
    BasePreference(
        title = title,
        summary = summary,
        icon = icon,
        customIcon = customIcon,
        iconTint = iconTint,
        iconBackgroundColor = iconBackgroundColor,
        position = position,
        enabled = enabled,
        modifier = modifier.clickable(enabled = enabled, onClick = onClick),
        widget = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                VerticalDivider(
                    modifier = Modifier
                        .height(32.dp)
                        .padding(horizontal = 4.dp),
                )
                Spacer(modifier = Modifier.width(8.dp))
                Switch(
                    checked = checked,
                    onCheckedChange = onCheckedChange,
                    enabled = enabled,
                )
            }
        },
    )
}
