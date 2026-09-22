package com.cs481.assignment_2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun getGrade(score : Int) : String {
//        return when (score) {
//            0..70
//        }
        when (score) {
            in 0..70 -> {
                return "F"
                // should the grade letters be in strings.xml? probably
            }
            in 70..73 -> {
                return "C-"
            }
            in 73..77 -> {
                return "C"
            }
            in 77..80 -> {
                return "C+"
            }
            in 80..83 -> {
                return "B-"
            }
            in 83..87 -> {
                return "B"
            }
            in 87..90 -> {
                return "B+"
            }
            in 90..94 -> {
                return "A-"
            }
            in 94..100 -> {
                return "A"
            }
            else -> {
                // invalid input
                return "invalid input"
            }
        }
    }
}