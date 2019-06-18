package com.dznow.utils

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat
import com.dznow.R
import com.dznow.services.WEBSITE
import javax.security.auth.Subject

fun shareAction(context: Context, title: String?, subject: String?, text: String?) {
    val i = Intent(Intent.ACTION_SEND)
    i.type = "text/plain"
    i.putExtra(Intent.EXTRA_SUBJECT, subject)
    i.putExtra(Intent.EXTRA_TEXT, text)
    ContextCompat.startActivity(context, Intent.createChooser(i, title), null)
}