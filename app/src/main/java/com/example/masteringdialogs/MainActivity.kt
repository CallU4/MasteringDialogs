package com.example.masteringdialogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.masteringdialogs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.button.setOnClickListener {
            showDialog()
        }
    }

    fun showDialog() {
        var dialog = CustomDialogFrag()
        dialog.show(supportFragmentManager, "custom")
    }
}