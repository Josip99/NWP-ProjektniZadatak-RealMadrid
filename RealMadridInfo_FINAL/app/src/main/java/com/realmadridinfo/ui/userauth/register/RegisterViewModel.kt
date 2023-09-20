package com.realmadridinfo.ui.userauth.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.userProfileChangeRequest
import com.realmadridinfo.ui.userauth.FlowMsgData
import com.realmadridinfo.ui.userauth.FlowMsgType
import com.realmadridinfo.ui.userauth.validateUserData
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class RegisterViewModel: ViewModel() {
    private val _flow = MutableSharedFlow<FlowMsgData>()
    val flow = _flow.asSharedFlow()

    fun userRegister(name: String, email: String, password: String) {
        viewModelScope.launch {
            _flow.emit(FlowMsgData(null, FlowMsgType.LOADING))
        }

        if (!validateUserData(email, password)) {
            viewModelScope.launch {
                _flow.emit(FlowMsgData(null, FlowMsgType.WRONG_INPUT))
            }
            return
        }

        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
            .addOnSuccessListener {

                val profileUpdates = userProfileChangeRequest {
                    this.displayName = name
                }
                val currUser = FirebaseAuth.getInstance().currentUser!!

                currUser.updateProfile(profileUpdates)
                    .addOnSuccessListener {
                        viewModelScope.launch {
                            _flow.emit(FlowMsgData(currUser, FlowMsgType.SUCCESS))
                        }
                    }.addOnFailureListener {
                        viewModelScope.launch {
                            _flow.emit(FlowMsgData(null, FlowMsgType.ERROR))
                        }
                    }
            }
            .addOnFailureListener {
                viewModelScope.launch {
                    _flow.emit(FlowMsgData(null, FlowMsgType.ERROR))
                }
            }
    }
}