package com.example.nearme.utils.extentions

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.nearme.features.nearbyplaces.ui.activities.MainActivity

fun Context.showMainActivity(bundle: Bundle? = null) {
    val intent = Intent(this, MainActivity::class.java)
    bundle?.let {
        intent.putExtras(it)
    }
    startActivity(intent)
}