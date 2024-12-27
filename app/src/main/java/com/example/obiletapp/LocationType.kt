package com.example.obiletapp



import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.borderColor
import com.example.myapplication.ui.theme.greyTextColor
import com.example.myapplication.ui.theme.primaryRedColor
import java.util.Locale

@Composable
fun LocationType(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .padding(horizontal = 24.dp)
            .background(Color.White, shape = RoundedCornerShape(2.dp))
            .border(1.dp, borderColor, shape = RoundedCornerShape(2.dp)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        VerticalLocationIcon()
        LocationCity()
    }
}

@Composable
fun LocationCity() {
    Column(
        modifier = Modifier.padding(top = 10.dp, start = 10.dp, end = 20.dp, bottom = 10.dp),

        ) {
        LocationCityItem(
            locationType = "Nereden",
            location = "İzmir"
        )
        LocationDivider()
        LocationCityItem(
            locationType = "Nereye",
            location = "İstanbul Avrupa"
        )
    }
}

@Composable
fun LocationCityItem(locationType: String, location: String) {
    Column(Modifier.padding(bottom = 10.dp)) {
        Text(
            text = locationType.uppercase(Locale.getDefault()),
            color = primaryRedColor,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = location,
            color = Color.Black,
            fontSize = 22.sp
        )
    }
}

@Composable
fun LocationDivider() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterStart),
            color = greyTextColor,
            thickness = 0.5.dp
        )

        Box(
            modifier = Modifier
                .size(40.dp)
                .align(Alignment.CenterEnd)
                .offset(x = (-20).dp)
                .background(
                    Color.White,
                    shape = RoundedCornerShape(10.dp)
                )
                .border(
                    2.dp, greyTextColor, shape = RoundedCornerShape(10.dp)
                )
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.ic_swap),
                contentDescription = "Icon",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                tint = greyTextColor
            )
        }
    }
}
