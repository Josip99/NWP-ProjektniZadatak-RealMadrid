package com.realmadridinfo.ui.userauth

import android.util.Patterns

fun validateUserData(email: String, password: String): Boolean {
    if (email.isEmpty())
        return false

    if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        return false

    if (password.isEmpty())
        return false

    if (password.length < 6)
        return false

    return true
}