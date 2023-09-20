package com.realmadridinfo.ui.userauth.login

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.realmadridinfo.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToRegisterFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_registerFragment)
  }
}
