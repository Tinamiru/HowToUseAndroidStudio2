package kr.co.aiai.myapp2

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivityBroadcast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val br : BroadcastReceiver = BroadCastMe()
        val filter = IntentFilter().apply{
            addAction(Intent.ACTION_SCREEN_ON)
        }
        registerReceiver(br, filter)

    }
}