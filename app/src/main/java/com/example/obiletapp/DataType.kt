package com.example.obiletapp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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

@Composable
fun DateType(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 20.dp)
            .background(Color.White, shape = RoundedCornerShape(2.dp))
            .border(1.dp, borderColor, shape = RoundedCornerShape(2.dp)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_calendar),
            contentDescription = null,
            tint = greyTextColor,
            modifier = Modifier.padding(start = 10.dp, end = 10.dp, bottom = 40.dp)
        )
        DateInfo()

    }
}

@Composable
fun DateInfo() {
    Column(modifier = Modifier.padding(top = 10.dp, start = 10.dp, end = 20.dp, bottom = 10.dp)) {
        LocationCityItem(
            locationType = "Gİdİş Tarİhİ",
            location = "1 Ocak 2025 Çarşamba"
        )
        HorizontalDivider(
            color = greyTextColor,
            thickness = 0.5.dp
        )
        Row(
            modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            TodayTomorrowButton(text = "Bugün")
            TodayTomorrowButton(text = "Yarın")
        }
    }
}

@Composable
fun TodayTomorrowButton(text: String) {
    Box(
        modifier = Modifier
            .border(
                width = 0.5.dp,
                color = Color.Black,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(top = 10.dp, bottom = 6.dp, start = 16.dp, end = 16.dp)
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}