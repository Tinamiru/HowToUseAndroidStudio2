package kr.co.aiai.myapp2

import android.app.Service
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast


class BroadCastMe : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if(intent.getAction().equals(Intent.ACTION_SCREEN_ON)){
            var toast = Toast.makeText(context, "good", Toast.LENGTH_LONG)
            toast.show()
        }
    }


}