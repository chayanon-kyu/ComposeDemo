package compose.project.demo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import composedemo.composeapp.generated.resources.Res
import composedemo.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(DesignSystem.Metric.Spacing.spacingL),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingL)
        ) {
            // DeliveryDetail
            Row {
                TextButton(
                    onClick = {},
                ) {
                    Row(
                        modifier = Modifier
                            .border(
                                border = ButtonDefaults.outlinedBorder,
                                shape = RoundedCornerShape(DesignSystem.Metric.CornerRadius.cornerM)
                            )
                            .padding(DesignSystem.Metric.Spacing.spacingM),
                        horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingM)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Top
                        ) {
                            Text("🚛") // Change To Image
                        }
                        Column(
                            verticalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
                        ) {
                            Text(
                                "centralwOrld 999/9 Rama I Rd, Pathum Wan, Bangkok 10330",
                                style = DesignSystem.Text.TextStyle.bodyM,
                                color = DesignSystem.Text.TextColor.secondary,
                                maxLines = 2
                            )
                            Text(
                                "No note to the driver",
                                style = DesignSystem.Text.TextStyle.bodyS,
                                color = DesignSystem.Text.TextColor.tertiary
                            )
                        }
                        Column(
                            verticalArrangement = Arrangement.Top
                        ) {
                            Text(">") // Change To Image
                        }
                    }
                }
            }

            // Slot
            Column {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingM)
                ) {
                    Text("🕓")
                    Text(
                        "Reserve a time slot tomorrow",
                        style = DesignSystem.Text.TextStyle.headingL,
                        color = DesignSystem.Text.TextColor.primary,
                        maxLines = 1
                    )
                    Spacer(modifier = Modifier.fillMaxWidth())
                }

                TextButton(
                    onClick = {},
                ) {
                    Column(
                        modifier = Modifier
                            .border(
                                border = ButtonDefaults.outlinedBorder,
                                shape = RoundedCornerShape(DesignSystem.Metric.CornerRadius.cornerM)
                            )
                            .padding(DesignSystem.Metric.Spacing.spacingM),
                        verticalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
                        ) {
                            Text(
                                "09:00 - 12:00",
                                style = DesignSystem.Text.TextStyle.headingM,
                                color = DesignSystem.Text.TextColor.primary
                            )
                            Text(
                                "·",
                                style = DesignSystem.Text.TextStyle.headingM,
                                color = DesignSystem.Text.TextColor.primary
                            )
                            Text(
                                "(Free, if >= ฿599)",
                                style = DesignSystem.Text.TextStyle.bodyM,
                                color = DesignSystem.Text.TextColor.secondary
                            )
                            Spacer(modifier = Modifier.weight(1.0f))
                            Text(
                                "฿30",
                                style = DesignSystem.Text.TextStyle.bodyM,
                                color = DesignSystem.Text.TextColor.primary
                            )
                        }
                        Text(
                            "Fastest delivery slot",
                            style = DesignSystem.Text.TextStyle.bodyS,
                            color = DesignSystem.Text.TextColor.secondary
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.fillMaxHeight())
        }
    }
}

object DesignSystem {
    object Text {
        object TextStyle {
            val headingS = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
            val headingM = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            val headingL = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            val bodyS = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal
            )
            val bodyM = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )
            val bodyL = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            )
        }
        object TextColor {
            val primary = Color.Black
            val secondary = Color.DarkGray
            val tertiary = Color.Gray
        }
    }
    object Metric {
        object Spacing {
            val spacingS = 4.dp
            val spacingM = 8.dp
            val spacingL = 12.dp
        }
        object CornerRadius {
            val cornerS = 4.dp
            val cornerM = 8.dp
            val cornerL = 12.dp
        }
    }
}