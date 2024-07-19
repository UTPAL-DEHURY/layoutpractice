package com.example.layoutpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutpractice.ui.theme.LayoutpracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutpracticeTheme {
                CombinedLayoutExample()
            }
        }
    }
}

@Composable
fun RowExample() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.LightGray),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier.size(50.dp).background(Color.Red))
        Box(modifier = Modifier.size(50.dp).background(Color.Green))
        Box(modifier = Modifier.size(50.dp).background(Color.Blue))
    }
}

@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .width(100.dp)
            .background(Color.LightGray),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.size(50.dp).background(Color.Red))
        Box(modifier = Modifier.size(50.dp).background(Color.Green))
        Box(modifier = Modifier.size(50.dp).background(Color.Blue))
    }
}

@Composable
fun BoxExample() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Box(modifier = Modifier.size(80.dp).background(Color.Red))
        Box(modifier = Modifier.size(60.dp).background(Color.Green))
        Box(modifier = Modifier.size(40.dp).background(Color.Blue))
    }
}

@Composable
fun CombinedLayoutExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        RowExample()
        Spacer(modifier = Modifier.height(16.dp))
        ColumnExample()
        Spacer(modifier = Modifier.height(16.dp))
        BoxExample()
    }
}

