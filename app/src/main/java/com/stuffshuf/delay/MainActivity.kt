package com.stuffshuf.delay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCount.setOnClickListener {

            count++
            tvField.text=count.toString()

        }
        btnWait.setOnClickListener {
            Thread.sleep(5000)
            tvField.text="DONE"
        }


    }
}
