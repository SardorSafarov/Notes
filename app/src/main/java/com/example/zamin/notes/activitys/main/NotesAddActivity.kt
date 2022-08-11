package com.example.zamin.notes.activitys.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zamin.notes.databinding.ActivityNotesAddBinding

class NotesAddActivity : AppCompatActivity() {
    private lateinit var binding:ActivityNotesAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotesAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}