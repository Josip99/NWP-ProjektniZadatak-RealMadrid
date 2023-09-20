package com.realmadridinfo.ui.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.realmadridinfo.data.models.Event
import com.realmadridinfo.data.models.Standing
import com.realmadridinfo.data.network.api.footapi.Client
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val _standings = MutableLiveData<List<Standing>?>()
    val standings: LiveData<List<Standing>?> = _standings

    private val _events = MutableLiveData<List<Event>?>()
    val events: LiveData<List<Event>?> = _events

    init {
        viewModelScope.launch {
            try {
                _standings.value = Client.getStandings()
                _events.value = Client.getEvents()
            } catch (e: Exception) {
                _standings.value = null
                _events.value = null
            }
        }
    }
}