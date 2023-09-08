package com.jay.nativewithunityappv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.widget.Button
import com.unity3d.player.UnityPlayerActivity

class UnityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, UnityPlayerActivity::class.java)
        startActivity(intent)
    }
}