package com.realmadridinfo.ui.main.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.realmadridinfo.databinding.FragmentHomeBinding
import com.realmadridinfo.R
import com.realmadridinfo.ui.dialogs.showConfirmationDialog
import com.realmadridinfo.ui.userauth.UserAuthActivity

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding
    private val viewModel by viewModels<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewModel = viewModel
        binding.apply {
            tvUser.text = FirebaseAuth.getInstance().currentUser!!.displayName
            btnLogout.setOnClickListener {
                showConfirmationDialog(requireContext(),
                    getString(R.string.text_logout),
                    getString(R.string.text_logout_message),
                    ::userLogout)
            }

            lifecycleOwner = viewLifecycleOwner
            rvStandings.adapter = StandingsAdapter()
            rvEvents.adapter = EventsAdapter()
        }
    }

    private fun userLogout() {
        FirebaseAuth.getInstance().signOut()
        val intent = Intent(requireActivity(), UserAuthActivity::class.java)
        startActivity(intent)
        requireActivity().finish()
    }
}