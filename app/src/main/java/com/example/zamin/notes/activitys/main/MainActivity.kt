package com.example.zamin.notes.activitys.main

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.zamin.notes.R
import com.example.zamin.notes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var pressedTime: Long = 0
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnFba.setOnClickListener {
            startActivity(Intent(this,NotesAddActivity::class.java))
        }
        
    }


    override fun onBackPressed() {
        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }
    
}