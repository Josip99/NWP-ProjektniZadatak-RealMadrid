//Opis dokumenta:
//    ViewModel za login fragment

package com.realmadridinfo.ui.userauth.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.realmadridinfo.ui.userauth.FlowMsgData
import com.realmadridinfo.ui.userauth.FlowMsgType
import com.realmadridinfo.ui.userauth.validateUserData
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {
    private val _flow = MutableSharedFlow<FlowMsgData>()
    val flow = _flow.asSharedFlow()

    fun userLogin(email: String, password: String) {
        viewModelScope.launch {
            _flow.emit(FlowMsgData(null, FlowMsgType.LOADING))
        }

        if (!validateUserData(email, password)) {
            viewModelScope.launch {
                _flow.emit(FlowMsgData(null, FlowMsgType.WRONG_INPUT))
            }
            return
        }

        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                viewModelScope.launch {
                    _flow.emit(FlowMsgData(it.user!!, FlowMsgType.SUCCESS))
                }
            }
            .addOnFailureListener {
                viewModelScope.launch {
                    _flow.emit(FlowMsgData(null, FlowMsgType.ERROR))
                }
            }
    }
}