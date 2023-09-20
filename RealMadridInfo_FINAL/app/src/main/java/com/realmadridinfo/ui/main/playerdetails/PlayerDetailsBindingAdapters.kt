package com.realmadridinfo.ui.main.playerdetails

import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import coil.load
import com.realmadridinfo.R

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
fun bindName(tv: TextView, name: String) {
    tv.text = name
}

@BindingAdapter("proposedMarketValue")
fun bindProposedMarketValue(tv: TextView, proposedMarketValue: Int) {
    tv.text = proposedMarketValue.toString()
}

@BindingAdapter("height")
fun bindHeight(tv: TextView, height: Int) {
    tv.text = height.toString()
}

@BindingAdapter("jerseyNumber")
fun bindJerseyNumber(tv: TextView, jerseyNumber: String) {
    tv.text = jerseyNumber
}

@BindingAdapter("position")
fun bindpPosition(tv: TextView, position: String) {
    tv.text = position
}

@BindingAdapter("preferredFoot")
fun bindpPreferredFoot(tv: TextView, preferredFoot: String) {
    tv.text = preferredFoot
}