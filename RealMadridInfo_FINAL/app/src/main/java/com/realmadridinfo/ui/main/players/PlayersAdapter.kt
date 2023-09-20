package com.realmadridinfo.ui.main.players

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.realmadridinfo.R
import com.realmadridinfo.data.models.Player
import com.realmadridinfo.databinding.RvItemPlayerBinding

class PlayersAdapter :
    RecyclerView.Adapter<PlayersAdapter.DataViewHolder>() {

    inner class DataViewHolder(private val binding: RvItemPlayerBinding):
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Player) {
            binding.player = data
        }
    }

    private val diffCallback = object : DiffUtil.ItemCallback<Player>() {
        override fun areItemsTheSame(oldItem: Player, newItem: Player): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Player, newItem: Player): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, diffCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        return DataViewHolder(
            RvItemPlayerBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val data = differ.currentList[position]
        holder.bind(data)

        holder.itemView.setOnClickListener {
            onClick?.invoke(data)
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    var onClick: ((Player) -> Unit)? = null
}













