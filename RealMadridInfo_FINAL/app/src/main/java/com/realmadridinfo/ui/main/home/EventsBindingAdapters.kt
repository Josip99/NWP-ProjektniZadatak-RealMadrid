package com.realmadridinfo.ui.main.home

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.realmadridinfo.data.models.Event
import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.time.Instant
import java.time.ZoneId
import java.util.Date

@BindingAdapter("events")
fun bindEvents(recyclerView: RecyclerView, standings: List<Event>?) {
    val adapter = recyclerView.adapter as EventsAdapter
    adapter.differ.submitList(standings)
}

@BindingAdapter("tournament")
fun bindTournament(tv: TextView, tournament: String) {
    tv.text = tournament
}

@BindingAdapter("date")
fun bindDate(tv: TextView, date: Long) {
    val dt = Instant.ofEpochSecond(date)
        .atZone(ZoneId.systemDefault())
        .toLocalDateTime()
    tv.text = dt.toString()
}

@BindingAdapter("isHome")
fun bindIsHome(tv: TextView, isHome: Boolean) {
    tv.text = if(isHome) "Kod kuce" else "U gostima"
}
