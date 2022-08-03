package kr.co.aiai.myapp2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(kr.co.aiai.myapp2.R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.textView)
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener(View.OnClickListener() {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        })
        Log.d("taekwon", "ActivityLifeCycle::onCreate")
    }

    override fun onStart() {
        Log.d("taekwon", "ActivityLifeCycle::onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("taekwon", "ActivityLifeCycle::onResume");
        super.onResume();
    }


    override fun onPause() {
        Log.d("taekwon", "ActivityLifeCycle::onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("taekwon", "ActivityLifeCycle::onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("taekwon", "ActivityLifeCycle::onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d("taekwon", "ActivityLifeCycle::onRestart")
        super.onRestart()
    }
}