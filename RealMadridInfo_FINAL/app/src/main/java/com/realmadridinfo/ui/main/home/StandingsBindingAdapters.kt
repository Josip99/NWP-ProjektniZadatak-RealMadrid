package com.realmadridinfo.ui.main.home

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.realmadridinfo.data.models.Standing

@BindingAdapter("standings")
fun bindStandings(recyclerView: RecyclerView, standings: List<Standing>?) {
    val adapter = recyclerView.adapter as StandingsAdapter
    adapter.differ.submitList(standings)
}

@BindingAdapter("position")
fun bindPosition(tv: TextView, position: Int) {
    tv.text = position.toString()
}

@BindingAdapter("team")
fun bindTeam(tv: TextView, team: String?) {
    tv.text = team
}

@BindingAdapter("points")
fun bindPoints(tv: TextView, points: Int) {
    tv.text = points.toString()
}
