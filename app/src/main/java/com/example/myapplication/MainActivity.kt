package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                var showBoxOneExampleOne by remember { mutableStateOf(true) }
                var showBoxOneExampleTwo by remember { mutableStateOf(true) }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        Icon(
                            painter = painterResource(id = if (showBoxOneExampleOne) R.drawable.box_one else R.drawable.box_two),
                            contentDescription = null
                        )
                        Button(onClick = { showBoxOneExampleOne = !showBoxOneExampleOne }) {
                            Text(text = "Toggle Vector Drawable")
                        }
                        Spacer(modifier = Modifier.height(24.dp))

                        Icon(
                            painter = painterResource(id = if (showBoxOneExampleTwo) R.drawable.box_one else R.drawable.box_two_group),
                            contentDescription = null
                        )
                        Button(onClick = { showBoxOneExampleTwo = !showBoxOneExampleTwo }) {
                            Text(text = "Toggle Vector Drawable - this one works")
                        }
                    }
                }
            }
        }
    }
}