package com.example.checkconnection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val cld: ConnectionLiveData by lazy { ConnectionLiveData(application) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkNetworkConnection()
    }

    private fun checkNetworkConnection() {

        cld.observe(this) { isConnected ->

            if (isConnected) {
                tv_check_connect.text = "connect"

            } else {
                tv_check_connect.text = "non connect"
            }

        }
    }
}