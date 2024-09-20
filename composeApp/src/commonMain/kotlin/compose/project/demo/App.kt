package compose.project.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
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
import androidx.compose.ui.unit.max
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
                .fillMaxWidth()
                .weight(1f)
                .verticalScroll(rememberScrollState())
                .padding(DesignSystem.Metric.Spacing.spacingL),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingL)
        ) {
            CartSceneDeliveryInformationSectionView()
            CartSceneSlotSectionView()
            CartSceneProductSectionView()
            CartSceneSummarySectionView()
        }
        CartSceneTotalSectionView()
    }
}

@Composable
@Preview
fun CartSceneDeliveryInformationSectionView() {
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
                        color = DesignSystem.Color.Text.secondary,
                        maxLines = 2
                    )
                    Text(
                        "No note to the driver",
                        style = DesignSystem.Text.TextStyle.bodyS,
                        color = DesignSystem.Color.Text.tertiary
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
fun CartSceneSlotSectionView() {
    Column {
        Row(
            horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingM)
        ) {
            Text("🕓")
            Text(
                "Reserve a time slot tomorrow",
                style = DesignSystem.Text.TextStyle.headingL,
                color = DesignSystem.Color.Text.primary,
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
                        color = DesignSystem.Color.Text.primary
                    )
                    Text(
                        "·",
                        style = DesignSystem.Text.TextStyle.headingM,
                        color = DesignSystem.Color.Text.primary
                    )
                    Text(
                        "(Free, if >= ฿599)",
                        style = DesignSystem.Text.TextStyle.bodyM,
                        color = DesignSystem.Color.Text.secondary
                    )
                    Spacer(modifier = Modifier.weight(1.0f))
                    Text(
                        "฿30",
                        style = DesignSystem.Text.TextStyle.bodyM,
                        color = DesignSystem.Color.Text.primary
                    )
                }
                Text(
                    "Fastest delivery slot",
                    style = DesignSystem.Text.TextStyle.bodyS,
                    color = DesignSystem.Color.Text.secondary
                )
            }
        }
    }
}

@Composable
@Preview
fun CartSceneProductSectionView() {
    Column(
        verticalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingM)
    ) {
        CartSceneProductSectionProductView()
        CartSceneProductSectionProductView()
        CartSceneProductSectionProductView()
    }
}

@Composable
@Preview
fun CartSceneProductSectionProductView() {
    var text by remember { mutableStateOf("1") }
    Row(
        horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingM)
    ) {
        Column(
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                "Image",
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
                "Homey Sesame Cracker 120G",
                style = DesignSystem.Text.TextStyle.bodyM,
                color = DesignSystem.Color.Text.primary
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
            ) {
                Text(
                    "฿12.50",
                    style = DesignSystem.Text.TextStyle.headingL,
                    color = DesignSystem.Color.Text.red
                )
                Text(
                    "฿25.00",
                    style = DesignSystem.Text.TextStyle.bodyM,
                    color = DesignSystem.Color.Text.tertiary,
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

@Composable
@Preview
fun CartSceneSummarySectionView() {
    Column(
        verticalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingM)
    ) {
        // BackToShopping
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
        ) {
            Text(
                "Want to add more items?",
                style = DesignSystem.Text.TextStyle.bodyM,
                color = DesignSystem.Color.Text.primary,
                maxLines = 1
            )
            TextButton(
                contentPadding = PaddingValues(),
                onClick = {}
            ) {
                Text(
                    "Back to Shopping",
                    style = DesignSystem.Text.TextStyle.headingM,
                    color = DesignSystem.Color.Text.tint,
                    maxLines = 1
                )
            }
            Spacer(modifier = Modifier.weight(1.0f))
        }
        // Weight
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(DesignSystem.Metric.CornerRadius.cornerL))
                .background(DesignSystem.Color.Background.primary)
                .padding(DesignSystem.Metric.Spacing.spacingM),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingM)
        ) {
            Text(
                "🧺",
                style = DesignSystem.Text.TextStyle.heading4XL,
                color = DesignSystem.Color.Text.primary
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
            ) {
                Text(
                    "We will weigh some of these items",
                    style = DesignSystem.Text.TextStyle.headingL,
                    color = DesignSystem.Color.Text.primary,
                    maxLines = 1
                )
                Text(
                    "You will pay for the final weight",
                    style = DesignSystem.Text.TextStyle.bodyS,
                    color = DesignSystem.Color.Text.secondary,
                    maxLines = 2
                )
            }
        }
        // OrderSummary
        Text(
            "Order Summary",
            style = DesignSystem.Text.TextStyle.headingL,
            color = DesignSystem.Color.Text.primary,
            maxLines = 1
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
            ) {
                Text(
                    "Total Price Before Discount",
                    style = DesignSystem.Text.TextStyle.bodyM,
                    color = DesignSystem.Color.Text.primary,
                    maxLines = 1
                )
                Spacer(modifier = Modifier.weight(1.0f))
                Text(
                    "฿12.50",
                    style = DesignSystem.Text.TextStyle.bodyM,
                    color = DesignSystem.Color.Text.primary,
                    maxLines = 1
                )
            }
        }
        Divider()
        // Total
        Row {
            Text(
                "Total",
                style = DesignSystem.Text.TextStyle.headingL,
                color = DesignSystem.Color.Text.primary,
                maxLines = 1
            )
            Spacer(modifier = Modifier.weight(1.0f))
            Text(
                "฿12.50",
                style = DesignSystem.Text.TextStyle.headingL,
                color = DesignSystem.Color.Text.primary,
                maxLines = 1
            )
        }
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
        ) {
            Text("🙂")
            Text(
                "Promotions and prices are calculated as of purchasing date which may differ from delivery date.",
                style = DesignSystem.Text.TextStyle.bodyS,
                color = DesignSystem.Color.Text.tertiary,
                maxLines = 2
            )
        }
        // ClubCard
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(DesignSystem.Metric.CornerRadius.cornerL))
                .background(DesignSystem.Color.Background.primary)
                .padding(DesignSystem.Metric.Spacing.spacingM),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
        ) {
            Text("💳")
            Column(
                verticalArrangement = Arrangement.spacedBy(DesignSystem.Metric.Spacing.spacingS)
            ) {
                Text(
                    "Start earning coins",
                    style = DesignSystem.Text.TextStyle.headingM,
                    color = DesignSystem.Color.Text.primary,
                    maxLines = 1
                )
                Text(
                    "My Lotus's only. Login or register to start earning.",
                    style = DesignSystem.Text.TextStyle.bodyS,
                    color = DesignSystem.Color.Text.secondary,
                    maxLines = 2
                )
            }
            Spacer(modifier = Modifier.weight(1.0f))
            TextButton(
                modifier = Modifier
                    .clip(RoundedCornerShape(DesignSystem.Metric.CornerRadius.cornerL))
                    .background(DesignSystem.Color.Button.secondary),
                contentPadding = PaddingValues(),
                onClick = {},
            ) {
                Text(
                    "Login",
                    style = DesignSystem.Text.TextStyle.headingL,
                    color = DesignSystem.Color.Text.primary
                )
            }
        }
    }
}

@Composable
@Preview
fun CartSceneTotalSectionView() {
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
                color = DesignSystem.Color.Text.primary
            )
            Spacer(modifier = Modifier.weight(1.0f))
            Text(
                "Select",
                style = DesignSystem.Text.TextStyle.headingM,
                color = DesignSystem.Color.Text.secondary
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
                color = DesignSystem.Color.Text.primary
            )
            Spacer(modifier = Modifier.weight(1.0f))
            Text(
                "Register / Login",
                style = DesignSystem.Text.TextStyle.headingM,
                color = DesignSystem.Color.Text.secondary,
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
                    color = DesignSystem.Color.Text.tertiary
                )
                Text(
                    "฿12.50",
                    style = DesignSystem.Text.TextStyle.heading2XL,
                    color = DesignSystem.Color.Text.primary
                )
                Text(
                    "Savings ฿12.50",
                    style = DesignSystem.Text.TextStyle.bodyS,
                    color = DesignSystem.Color.Text.red
                )
            }
            Spacer(modifier = Modifier.weight(1.0f))
            TextButton(
                modifier = Modifier
                    .clip(RoundedCornerShape(DesignSystem.Metric.CornerRadius.cornerL))
                    .background(DesignSystem.Color.Button.primary),
                onClick = {},
            ) {
                Text(
                    "Place Order",
                    style = DesignSystem.Text.TextStyle.heading2XL,
                    color = DesignSystem.Color.Text.white,
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
    object Color {
        private val green600 = Color(0xFF00BCB4)
        private val gray700 = Color(0xFF424242)
        private val gray550 = Color(0xFF6B6B6B)
        private val gray500 = Color(0xFF7D7D7D)
        private val gray75 = Color(0xFFE8E8E8)
        private val gray50 = Color(0xFFEDEDED)
        private val gray25 = Color(0xFFF3F3F3)
        private val red = Color(0xFFFF211C)
        private val white = Color(0xFFFFFFFF)

        object Text {
            val primary = gray700
            val secondary = gray550
            val tertiary = gray500
            val red = Color.red
            val white = Color.white
            val tint = green600
        }
        object Button {
            val primary = green600
            val secondary = gray75
        }
        object Background {
            val white = Color.white
            val primary = gray25
        }
    }
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