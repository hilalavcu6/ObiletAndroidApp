package com.example.obiletapp


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.greyTextColor
import com.example.myapplication.ui.theme.searchButtonColor

@Composable
fun SearchButton() {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val paddingValue = screenWidth / 6
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = paddingValue, vertical = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = searchButtonColor),
            shape = RoundedCornerShape(6.dp),
            contentPadding = PaddingValues(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Otobüs Ara",
                fontSize = 20.sp,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Kesintisiz İade Hakkı ve 0 Komisyon",
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            color = greyTextColor
        )
    }
}