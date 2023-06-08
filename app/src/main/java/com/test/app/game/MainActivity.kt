package com.test.app.game

import android.os.Bundle
import android.view.MotionEvent
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.test.app.game.ui.theme.TestAppGameTheme
//import androidx.appcompat.app.AppCompatActivity
//import com.test.app.game.touchmove.TouchMoveLayout

class MainActivity : ComponentActivity() {
    //    private lateinit var touchMoveLayout: TouchMoveLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestAppGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AppNavigationComponent()
                }
            }
        }
//        touchMoveLayout = findViewById(touchMoveLayout)
//        touchMoveLayout.setOnTouchListener { _, event ->
//            when (event.action) {
//                MotionEvent.ACTION_DOWN -> {
//                    // Xử lý khi cảm ứng tay bắt đầu
//                    return@setOnTouchListener true
//                }
//                MotionEvent.ACTION_MOVE -> {
//                    // Xử lý khi cảm ứng tay di chuyển
//                    scrollDown()
//                    return@setOnTouchListener true
//                }
//                MotionEvent.ACTION_UP -> {
//                    // Xử lý khi cảm ứng tay kết thúc
//                    stopScrolling()
//                    return@setOnTouchListener true
//                }
//                else -> return@setOnTouchListener false
//            }
//        }
//    }
//    private fun scrollDown() {
//        // Xử lý cuộn xuống
//        println("Scrolling down...")
//    }
//
//    private fun stopScrolling() {
//        // Xử lý dừng cuộn
//        println("Stopped scrolling.")
//    }
    }
}

