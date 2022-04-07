package com.example.quizzz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.quizzz.editingrecyclerview.ProfileActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.exploreNow);
        btn.setOnClickListener {
            val intent = Intent(this, ProfileActivity ::class.java)
            startActivity(intent);
        }
    }
}