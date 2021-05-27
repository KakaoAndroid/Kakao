package io.github.kakaocup.sample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class AlertDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        findViewById<View>(R.id.show_alert_dialog).setOnClickListener {
            AlertDialog
                .Builder(this)
                .setTitle("Title")
                .setIcon(R.drawable.ic_android_black_24dp)
                .setMessage("Message")
                .setPositiveButton("Positive") { _, _ -> }
                .setNegativeButton("Negative") { _, _ -> }
                .setNeutralButton("Neutral") { _, _ -> }
                .create()
                .show()
        }
    }
}
