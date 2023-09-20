package com.realmadridinfo.ui.dialogs

import android.app.AlertDialog
import android.content.Context
import com.realmadridinfo.R

fun showConfirmationDialog(context: Context, title: String, message: String, positive: () -> Unit) {
    val strGoBack = context.getString(R.string.text_go_back)
    val strConfirm = context.getString(R.string.text_confirm)

    val alertDialog = AlertDialog.Builder(context).apply {
        setTitle(title)
        setMessage(message)
        setNegativeButton(strGoBack) { dialog, _ ->
            dialog.dismiss()
        }
        setPositiveButton(strConfirm) { dialog, _ ->
            positive()
            dialog.dismiss()
        }
    }
    alertDialog.create()
    alertDialog.show()
}

fun showErrorDialog(context: Context, message: String) {
    val strError = context.getString(R.string.error_error)
    val strGoBack = context.getString(R.string.text_go_back)

    val alertDialog = AlertDialog.Builder(context).apply {
        setTitle(strError)
        setMessage(message)
        setPositiveButton(strGoBack) { dialog, _ ->
            dialog.dismiss()
        }
    }
    alertDialog.create()
    alertDialog.show()
}