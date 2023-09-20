package com.realmadridinfo.ui.main.players

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.realmadridinfo.databinding.FragmentPlayersBinding
import com.realmadridinfo.R
import com.realmadridinfo.ui.dialogs.showErrorDialog
import com.realmadridinfo.ui.main.MainActivity
import com.realmadridinfo.ui.userauth.FlowMsgType
import kotlinx.coroutines.launch

class PlayersFragment : Fragment(R.layout.fragment_players) {
    private lateinit var binding: FragmentPlayersBinding
    private val viewModel by viewModels<PlayersViewModel>()

    private lateinit var playersAdapter: PlayersAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlayersBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewModel = viewModel
        binding.apply {
            lifecycleOwner = viewLifecycleOwner

            playersAdapter = PlayersAdapter()
            playersAdapter.onClick = {
                val b = Bundle().apply { putParcelable("player", it) }
                findNavController().navigate(R.id.action_playersFragment_to_playerDetailsFragment, b)
            }

            rvPlayers.adapter = playersAdapter
        }
    }

    private fun showLoading() {
        binding.apply {
            pbProgress.visibility = View.VISIBLE
            rvPlayers.visibility = View.GONE
        }
    }

    private fun hideLoading() {
        binding.apply {
            pbProgress.visibility = View.GONE
            rvPlayers.visibility = View.VISIBLE
        }
    }

    override fun onResume() {
        super.onResume()

        val nav = (activity as MainActivity).findViewById<BottomNavigationView>(R.id.bottomNavigation)
        nav.visibility = View.VISIBLE
    }
}