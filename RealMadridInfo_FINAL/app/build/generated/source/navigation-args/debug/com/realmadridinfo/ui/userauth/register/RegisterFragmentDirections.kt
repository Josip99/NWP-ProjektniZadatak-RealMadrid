package com.realmadridinfo.ui.userauth.register

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.realmadridinfo.R

public class RegisterFragmentDirections private constructor() {
  public companion object {
    public fun actionRegisterFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_registerFragment_to_loginFragment)
  }
}
