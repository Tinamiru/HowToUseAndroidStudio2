package kr.co.aiai.myapp2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivityService : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(kr.co.aiai.myapp2.R.layout.activity_main_service)
        val btnStart: Button = findViewById<Button>(R.id.btnStart)
        val btnClose: Button = findViewById<Button>(R.id.btnClose)

        btnStart.setOnClickListener {
            val intent = Intent(this, ServiceMe::class.java)
            intent.putExtra("ddit","홍길동")
            startService(intent)
        }
        btnClose.setOnClickListener {
            val intent = Intent(this, ServiceMe::class.java)
            stopService(intent)
        }
    }
}