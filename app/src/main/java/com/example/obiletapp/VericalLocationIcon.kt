package com.example.obiletapp



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.greyTextColor

@Composable
fun VerticalLocationIcon() {
    Column(
        modifier = Modifier
            .padding(start = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Icon(
            imageVector = Icons.Default.LocationOn,
            contentDescription = null,
            tint = greyTextColor,
        )
        Column(
            modifier = Modifier
                .padding(vertical = 4.dp)
                .width(4.dp)
                .height(50.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            repeat(5) {
                Spacer(
                    modifier = Modifier
                        .size(4.dp)
                        .background(greyTextColor, shape = CircleShape)
                )
            }
        }
        Icon(
            imageVector = Icons.Default.LocationOn,
            contentDescription = null,
            tint = greyTextColor,
        )
    }
}