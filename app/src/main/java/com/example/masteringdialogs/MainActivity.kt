package com.example.masteringdialogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.masteringdialogs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        var phones = ArrayList<String>()
        phones.add("IPhone")
        phones.add("OnePlus")
        phones.add("Galaxy Note")
        phones.add("Astorphya S")

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, phones)
        bind.phoneList.adapter = adapter

        bind.phoneList.setOnItemClickListener { parent, view, pos, id ->
            var selectedPhone = adapter.getItem(pos)
            var dialog = CustomDialogFrag()
            var args = Bundle()
            args.putString("phone", selectedPhone)
            dialog.arguments = args
            dialog.show(supportFragmentManager, "custom")
        }
    }

    fun showDialog() {
        var dialog = CustomDialogFrag()
        dialog.show(supportFragmentManager, "custom")
    }
}