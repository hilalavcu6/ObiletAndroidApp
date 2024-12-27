package com.example.obiletapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.primaryRedColor
import com.example.obiletapp.ui.theme.MyApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Scaffold(
                        containerColor = Color.White,
                        topBar = {
                            TopAppBar(
                                title = {
                                    Box(
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.logo),
                                            contentDescription = stringResource(R.string.app_name),
                                            colorFilter = ColorFilter.tint(Color.White),
                                            modifier = Modifier
                                                .scale(0.3f)
                                                .align(Alignment.BottomCenter)
                                        )
                                    }
                                },
                                colors = TopAppBarDefaults.topAppBarColors(
                                    containerColor = primaryRedColor,
                                ),
                            )
                        },
                        content = { paddingValues ->
                            Column(
                                modifier = Modifier.padding(paddingValues),
                                verticalArrangement = Arrangement.spacedBy(0.dp)
                            ) {
                                SearchType()
                                LocationType()
                                DateType()
                                SearchButton()
                            }
                        },
                        bottomBar = { BottomAppBarItems() }
                    )
                }
            }
        }
    }
}
