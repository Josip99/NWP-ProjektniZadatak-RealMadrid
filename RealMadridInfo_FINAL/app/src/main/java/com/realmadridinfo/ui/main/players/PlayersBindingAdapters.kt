package com.realmadridinfo.ui.main.players

import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.realmadridinfo.R
import com.realmadridinfo.data.models.Player

@BindingAdapter("players")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<Player>?) {
    val adapter = recyclerView.adapter as PlayersAdapter
    adapter.differ.submitList(data)
}

@BindingAdapter("imageUrl")
fun bindImage(iv: ImageView, imgUrl: String?) {
    imgUrl?.let {
        val imgUri = imgUrl.toUri().buildUpon().scheme("https").build()
        iv.load(imgUri) {
            placeholder(R.drawable.anim_loading)
            error(R.drawable.ic_broken_image)
        }
    }
}

@BindingAdapter("name")
fun bindName(tv: TextView, name: String?) {
    tv.text = name
}

@BindingAdapter("proposedMarketValue")
fun bindProposedMarketValue(tv: TextView, proposedMarketValue: Int?) {
    tv.text = "Cijena: " + proposedMarketValue.toString()
}