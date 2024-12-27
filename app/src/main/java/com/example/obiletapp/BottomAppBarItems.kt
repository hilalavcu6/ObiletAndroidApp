package com.example.obiletapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.bottomNavBarColor
import com.example.myapplication.ui.theme.greyTextColor
import com.example.myapplication.ui.theme.primaryRedColor

@Composable
fun BottomAppBarItems() {
    BottomAppBar(
        contentPadding = PaddingValues(16.dp),
        containerColor = bottomNavBarColor,
        content = {
            Spacer(modifier = Modifier.weight(1f))
            BottomAppBarItem(
                isSelected = true,
                icon = R.drawable.ic_search,
                text = "Ara"
            )
            Spacer(modifier = Modifier.weight(1f))
            BottomAppBarItem(
                icon = R.drawable.ic_route,
                text = "Seyahatlerim"
            )
            Spacer(modifier = Modifier.weight(1f))
            BottomAppBarItem(
                icon = R.drawable.ic_help,
                text = "Yardım"
            )
            Spacer(modifier = Modifier.weight(1f))
            BottomAppBarItem(
                icon = R.drawable.ic_person,
                text = "Hesabım"
            )
            Spacer(modifier = Modifier.weight(1f))
        }
    )
}

@Composable
fun BottomAppBarItem(icon: Int, text: String, isSelected: Boolean = false) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            tint = if (isSelected) primaryRedColor else greyTextColor,
            imageVector = ImageVector.vectorResource(id = icon),
            contentDescription = "",
        )
        Text(
            text = text,
            color = if (isSelected) primaryRedColor else greyTextColor,
            fontWeight = FontWeight.Normal,
            style = TextStyle(letterSpacing = 0.2.sp)
        )
    }
}