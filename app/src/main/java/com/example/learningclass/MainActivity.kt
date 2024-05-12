package com.example.learningclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningclass.ui.theme.LearningclassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningclassTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp)
                    ) {

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Icon(
                                modifier = Modifier.size(24.dp),
                                painter = painterResource(id = R.drawable.ic_menu),
                                contentDescription = "icon menu"
                            )

                            Text(text = "My Profile", fontSize = 32.sp)

                            Icon(
                                painter = painterResource(id = R.drawable.ic_notify),
                                contentDescription = "notification menu"
                            )


                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(24.dp)
                        ) {

                            Box(
                                modifier = Modifier
                                    .background(
                                        color = Color.Black,
                                        shape = CircleShape
                                    )
                                    .padding(8.dp)
                            ) {

                                Image(
                                    modifier = Modifier.size(40.dp),
                                    painter = painterResource(id = R.drawable.img_person),
                                    contentDescription = "image person"
                                )

                            }

                            Spacer(modifier = Modifier.width(8.dp))

                            Column {
                                Text(text = "Wlcome back,", fontSize = 16.sp, color = Color.Gray)
                                Text(
                                    text = "John Sortino",
                                    fontSize = 20.sp,
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {

                            Column {
                                Text(text = "shelf it's all about you read.")
                                Text(text = "try and enjoy.")
                            }

                            Box(
                                modifier = Modifier
                                    .background(color = Color.Green)
                                    .padding(8.dp),
                                contentAlignment = Alignment.Center
                            ) {

                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        modifier = Modifier.size(20.dp),
                                        painter = painterResource(id = R.drawable.ic_snow),
                                        contentDescription = "icon snow"
                                    )

                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(text = "Smart Picker")
                                }
                            }

                        }
                    }

                }
            }
        }
    }
}
