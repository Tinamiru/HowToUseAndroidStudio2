package kr.co.aiai.myapp2

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast


class ServiceMe : Service() {

    override fun onCreate() {
        val toast = Toast.makeText(this, "serviceme:onCreate", Toast.LENGTH_LONG)
        toast.show()
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val toast = Toast.makeText(this, "serviceme:onStart", Toast.LENGTH_LONG)
        toast.show()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        val toast = Toast.makeText(this, "serviceme:onDestroy", Toast.LENGTH_LONG)
        toast.show()
        super.onDestroy()
    }


    override fun onBind(p0: Intent?): IBinder? {
        val toast = Toast.makeText(this, "serviceme:onBind", Toast.LENGTH_LONG)
        toast.show()
        TODO("Not yet implemented")
    }

}