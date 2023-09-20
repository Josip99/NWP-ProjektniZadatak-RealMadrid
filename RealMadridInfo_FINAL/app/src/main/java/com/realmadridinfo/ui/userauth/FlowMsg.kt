package com.realmadridinfo.ui.userauth

import com.google.firebase.auth.FirebaseUser

enum class FlowMsgType {
    WRONG_INPUT,
    LOADING,
    SUCCESS,
    ERROR
}

data class FlowMsgData(
    val data: FirebaseUser? = null,
    val type: FlowMsgType,
    val message: String? = null
)
