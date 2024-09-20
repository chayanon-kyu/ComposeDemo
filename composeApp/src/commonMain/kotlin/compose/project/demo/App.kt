package compose.project.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        CartScene()
    }
}

@Composable
@Preview
fun CartScene() {
    Column {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxWidth()
                .padding(DesignSystem.Metric.Spacing.spacingL),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingL)
        ) {
            CartSceneDeliveryInformationView()
            CartSceneSlotSelectionView()
            CartSceneProductListView()
        }
        Spacer(modifier = Modifier.weight(1.0f))
        CartSceneBottomSectionView()
    }
}

@Composable
@Preview
fun CartSceneDeliveryInformationView() {
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
}

@Composable
@Preview
fun CartSceneSlotSelectionView() {
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
}

@Composable
@Preview
fun CartSceneProductListView() {
    var text by remember { mutableStateOf("1") }
    Column(
        verticalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingM)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingM)
        ) {
            Column(
                verticalArrangement = Arrangement.Top
            ) {
                Text("Image",
                    modifier = Modifier
                        .width(60.dp)
                        .height(60.dp)
                        .border(
                            border = ButtonDefaults.outlinedBorder,
                            shape = RoundedCornerShape(DesignSystem.Metric.CornerRadius.cornerM)
                        )
                        .clip(RoundedCornerShape(DesignSystem.Metric.CornerRadius.cornerS))
                        .background(Color.LightGray)
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
            ) {
                Text(
                    "ProductName",
                    style = DesignSystem.Text.TextStyle.bodyM,
                    color = DesignSystem.Text.TextColor.primary
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
                ) {
                    Text(
                        "฿12.50",
                        style = DesignSystem.Text.TextStyle.headingL,
                        color = DesignSystem.Text.TextColor.red
                    )
                    Text(
                        "฿25.00",
                        style = DesignSystem.Text.TextStyle.bodyM,
                        color = DesignSystem.Text.TextColor.tertiary,
                        textDecoration = TextDecoration.LineThrough
                    )
                }
            }
            Spacer(modifier = Modifier.weight(1.0f))
            Column(
                modifier = Modifier
                    .width(80.dp),
                verticalArrangement = Arrangement.Top
            ) {
                TextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { },
                    textStyle = DesignSystem.Text.TextStyle.bodyM.copy(textAlign = TextAlign.Center)
                )
            }
        }
    }
}

@Composable
@Preview
fun CartSceneBottomSectionView() {
    Column {
        Divider()
        Row(
            modifier = Modifier
                .padding(DesignSystem.Metric.Spacing.spacingL),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
        ) {
            Text("📃")
            Text(
                "Coupons and Vouchers",
                style = DesignSystem.Text.TextStyle.headingM,
                color = DesignSystem.Text.TextColor.primary
            )
            Spacer(modifier = Modifier.weight(1.0f))
            Text(
                "Select",
                style = DesignSystem.Text.TextStyle.headingM,
                color = DesignSystem.Text.TextColor.secondary
            )
            Text(">")
        }
        Divider()
        Row(
            modifier = Modifier
                .padding(DesignSystem.Metric.Spacing.spacingL),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
        ) {
            Text("🪙")
            Text(
                "Use Lotus's Coins",
                style = DesignSystem.Text.TextStyle.headingM,
                color = DesignSystem.Text.TextColor.primary
            )
            Spacer(modifier = Modifier.weight(1.0f))
            Text(
                "Register / Login",
                style = DesignSystem.Text.TextStyle.headingM,
                color = DesignSystem.Text.TextColor.secondary,
                textDecoration = TextDecoration.Underline
            )
        }
        Divider()
        Row(
            modifier = Modifier
                .padding(DesignSystem.Metric.Spacing.spacingL),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
            ) {
                Text(
                    "Total",
                    style = DesignSystem.Text.TextStyle.bodyS,
                    color = DesignSystem.Text.TextColor.tertiary
                )
                Text(
                    "฿12.50",
                    style = DesignSystem.Text.TextStyle.heading2XL,
                    color = DesignSystem.Text.TextColor.primary
                )
                Text(
                    "Savings ฿12.50",
                    style = DesignSystem.Text.TextStyle.bodyS,
                    color = DesignSystem.Text.TextColor.red
                )
            }
            Spacer(modifier = Modifier.weight(1.0f))
            TextButton(
                modifier = Modifier
                    .clip(RoundedCornerShape(DesignSystem.Metric.CornerRadius.cornerL))
                    .background(Color.Gray),
                onClick = {},
            ) {
                Text(
                    "Place Order",
                    style = DesignSystem.Text.TextStyle.heading2XL,
                    color = DesignSystem.Text.TextColor.white,
                    modifier = Modifier
                        .padding(
                            vertical = DesignSystem.Metric.Spacing.spacingS,
                            horizontal = DesignSystem.Metric.Spacing.spacingL * 4
                        )
                )
            }
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
            val headingXL = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            val heading2XL = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            val heading3XL = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            val heading4XL = TextStyle(
                fontSize = 24.sp,
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
            val red = Color.Red
            val white = Color.White
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