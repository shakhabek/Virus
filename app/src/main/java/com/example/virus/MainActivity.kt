package com.example.virus

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var handler: Handler
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mediaPlayer = MediaPlayer.create(this, R.raw.audio2)
        mediaPlayer.start()
        handler = Handler(Looper.getMainLooper())

        handler.postDelayed(runnable, 190)

    }

    private val runnable = object : Runnable {
        override fun run() {
            handler.postDelayed(this, 200)
            finish()
            startActivity(Intent(this@MainActivity, MainActivity2::class.java))

        }

    }
}