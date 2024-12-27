package com.example.obiletapp



import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.iconColor
import com.example.myapplication.ui.theme.primaryRedColor


@Composable
fun SearchType(modifier: Modifier = Modifier) {
    BoxWithConstraints(modifier = modifier.fillMaxWidth()) {
        val maxHeight = this.maxHeight
        val topHeight: Dp = maxHeight * 2 / 15
        val bottomHeight: Dp = maxHeight / 11

        Box(
            Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
                .height(topHeight)
                .background(primaryRedColor)
        ) {}

        Box(
            Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .height(bottomHeight)
                .background(Color.White)
        ) {}

        Center(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, bottom = 20.dp)
                .fillMaxWidth()
                .wrapContentHeight()
                .align(Alignment.BottomCenter)
        )
    }
}

@Composable
fun Center(modifier: Modifier) {
    Box(
        modifier = modifier
            .padding(4.dp)
    ) {
        Box(
            modifier = Modifier
                .matchParentSize()
                .align(Alignment.BottomCenter)
                .shadow(
                    16.dp,
                    shape = RoundedCornerShape(10.dp),
                    spotColor = Color.Black.copy(alpha = 0.6f)
                )
        )

        Box(
            modifier = Modifier
                .background(Color.White, shape = RoundedCornerShape(10.dp))
                .border(1.dp, Color.White, shape = RoundedCornerShape(10.dp))
                .padding(2.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                SearchTypeItem(
                    text = "Otobüs",
                    icon = R.drawable.ic_bus,
                    isSelected = true,
                )
                SearchTypeItem(
                    text = "Uçak",
                    icon = R.drawable.ic_airplane,
                )
                SearchTypeItem(
                    text = "Otel",
                    icon = R.drawable.ic_hotel,
                )
                SearchTypeItem(
                    text = "Araç",
                    icon = R.drawable.ic_car,
                )
                SearchTypeItem(
                    text = "Feribot",
                    icon = R.drawable.ic_boat,
                )
            }
        }
    }
}


@Composable
fun SearchTypeItem(
    text: String,
    icon: Int,
    isSelected: Boolean = false,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .background(
                color = if (isSelected) primaryRedColor else Color.White,
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(10.dp)
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = icon),
                contentDescription = null,
                tint = if (isSelected) Color.White else iconColor
            )
            Text(
                text = text,
                color = if (isSelected) Color.White else iconColor
            )
        }
    }
}
