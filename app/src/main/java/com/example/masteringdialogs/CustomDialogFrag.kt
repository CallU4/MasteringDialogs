package com.example.masteringdialogs

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment

class CustomDialogFrag : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        var builder = AlertDialog.Builder(activity)

        return builder.setTitle("Hello world!").setIcon(android.R.drawable.ic_dialog_alert)
            .setMessage("To close?")
            .setPositiveButton("OK", null)
        .create()
    }

    private fun showLogs() {
        Log.d("MyTag", "Shown Dialog")
    }


}