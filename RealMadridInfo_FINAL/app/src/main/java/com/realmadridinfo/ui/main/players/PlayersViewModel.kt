package com.realmadridinfo.ui.main.players

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.realmadridinfo.data.models.Player
import com.realmadridinfo.data.network.api.footapi.Client
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class PlayersViewModel : ViewModel() {
    private val _players = MutableLiveData<List<Player>>()
    val players: LiveData<List<Player>> = _players

    init {
        viewModelScope.launch {
            try {
                var players: List<Player> = listOf()
                async { players = Client.getPlayers() }.await()
                for (player in players) {
                    async {
                        player.imageUrl =
                            com.realmadridinfo.data.network.api.thesportsdb.Client.getPlayerImage(
                                player.name
                            )
                    }.await()
                }

                _players.value = players
            } catch (e: Exception) {
                _players.value = listOf()
            }
        }
    }
}