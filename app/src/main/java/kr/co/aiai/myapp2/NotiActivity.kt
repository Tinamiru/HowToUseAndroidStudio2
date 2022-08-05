package kr.co.aiai.myapp2

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NotiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noti)

        var btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val notificationmanager = getSystemService((NOTIFICATION_SERVICE)) as NotificationManager
            val notification = Notification()

            notification.flags = notification.flags or Notification.FLAG_AUTO_CANCEL
            notification.tickerText = "playing..."

            val intent = Intent(this,NotiActivity::class.java)

            val pendingIntent = PendingIntent.getActivity(this,0,intent,0)

            notificationmanager.notify(1, notification)

        }

    }
}