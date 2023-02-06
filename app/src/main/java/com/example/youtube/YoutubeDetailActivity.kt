package com.example.youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class YoutubeDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube_detail)

        val videoUrl = intent.getStringExtra("video_url")

        val mediaController = MediaController(this)

        findViewById<VideoView>(R.id.youtube_videoView).apply {
            this.setVideoPath(videoUrl)
            this.requestFocus()
            this.start()
            mediaController.show()
        }

        // Exoplayer
        // - 기능이 많다
        // - 사용이 쉽다
        // - DRM
        // - Streaming
    }
}