package com.realmadridinfo.ui.userauth.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.realmadridinfo.R
import com.realmadridinfo.databinding.FragmentLoginBinding
import com.realmadridinfo.ui.dialogs.showErrorDialog
import com.realmadridinfo.ui.main.MainActivity
import com.realmadridinfo.ui.userauth.FlowMsgType
import kotlinx.coroutines.launch

class LoginFragment : Fragment(R.layout.fragment_login) {
    private lateinit var binding: FragmentLoginBinding
    private val viewModel by viewModels<LoginViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            tvGotoRegister.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
            }

            btnLogin.setOnClickListener {
                val email = etEmail.text.toString().trim()
                val password = etPassword.text.toString()
                viewModel.userLogin(email, password)
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.flow.collect {
                when (it.type) {
                    FlowMsgType.LOADING ->
                        showLoading()

                    FlowMsgType.WRONG_INPUT -> {
                        hideLoading()
                        showErrorDialog(requireContext(), getString(R.string.error_invalid_input))
                    }

                    FlowMsgType.SUCCESS -> {
                        hideLoading()
                        Intent(requireActivity(), MainActivity::class.java).also { intent ->
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                            startActivity(intent)
                        }
                    }

                    FlowMsgType.ERROR -> {
                        hideLoading()
                        showErrorDialog(requireContext(), getString(R.string.error_firebase))
                    }
                }
            }
        }
    }

    private fun showLoading() {
        binding.apply {
            pbProgress.visibility = View.VISIBLE
            etEmail.isEnabled = false
            etPassword.isEnabled = false
            btnLogin.isEnabled = false
            tvGotoRegister.isEnabled = false
        }
    }

    private fun hideLoading() {
        binding.apply {
            pbProgress.visibility = View.GONE
            etEmail.isEnabled = true
            etPassword.isEnabled = true
            btnLogin.isEnabled = true
            tvGotoRegister.isEnabled = true
        }
    }
}