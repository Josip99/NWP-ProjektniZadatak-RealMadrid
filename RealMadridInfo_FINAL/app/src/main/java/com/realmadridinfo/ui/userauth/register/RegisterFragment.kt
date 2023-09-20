package com.realmadridinfo.ui.userauth.register

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
import com.realmadridinfo.databinding.FragmentRegisterBinding
import com.realmadridinfo.ui.dialogs.showErrorDialog
import com.realmadridinfo.ui.main.MainActivity
import com.realmadridinfo.ui.userauth.FlowMsgType
import kotlinx.coroutines.launch

class RegisterFragment : Fragment() {
    private lateinit var binding: FragmentRegisterBinding
    private val viewModel by viewModels<RegisterViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnRegister.setOnClickListener {
                val name = etName.text.toString().trim()
                val email = etEmail.text.toString().trim()
                val password = etPassword.text.toString()
                viewModel.userRegister(name, email, password)
            }

            tvGotoLogin.setOnClickListener {
                findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
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
            etName.isEnabled = false
            etEmail.isEnabled = false
            etPassword.isEnabled = false
            btnRegister.isEnabled = false
            tvGotoLogin.isEnabled = false
        }
    }

    private fun hideLoading() {
        binding.apply {
            pbProgress.visibility = View.GONE
            etName.isEnabled = true
            etEmail.isEnabled = true
            etPassword.isEnabled = true
            btnRegister.isEnabled = true
            tvGotoLogin.isEnabled = true
        }
    }
}