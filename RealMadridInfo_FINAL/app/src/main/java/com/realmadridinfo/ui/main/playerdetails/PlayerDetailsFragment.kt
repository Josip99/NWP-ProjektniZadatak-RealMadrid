package com.realmadridinfo.ui.main.playerdetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.realmadridinfo.R
import com.realmadridinfo.data.models.Player
import com.realmadridinfo.databinding.FragmentPlayerDetailsBinding
import com.realmadridinfo.ui.main.MainActivity
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class PlayerDetailsFragment : Fragment() {
    private lateinit var binding: FragmentPlayerDetailsBinding

    private val args by navArgs<PlayerDetailsFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (activity as MainActivity).findViewById<BottomNavigationView>(R.id.bottomNavigation).
        visibility = View.GONE
        
        binding = FragmentPlayerDetailsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.player = args.player
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
        }
    }
}