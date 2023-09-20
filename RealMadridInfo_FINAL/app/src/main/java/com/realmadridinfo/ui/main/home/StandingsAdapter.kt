package com.realmadridinfo.ui.main.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.realmadridinfo.data.models.Standing
import com.realmadridinfo.data.network.api.footapi.Settings.REALMADRID_ID
import com.realmadridinfo.databinding.RvItemStandingBinding

class StandingsAdapter :
    RecyclerView.Adapter<StandingsAdapter.DataViewHolder>() {

    inner class DataViewHolder(private val binding: RvItemStandingBinding):
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Standing) {
            binding.standing = data

            if (data.id == REALMADRID_ID) {
                binding.tvPosition.textSize = 20F
                binding.tvName.textSize = 20F
                binding.tvPoints.textSize = 20F
            }
        }
    }

    private val diffCallback = object : DiffUtil.ItemCallback<Standing>() {
        override fun areItemsTheSame(oldItem: Standing, newItem: Standing): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Standing, newItem: Standing): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, diffCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        return DataViewHolder(
            RvItemStandingBinding.inflate(
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

    var onClick: ((Standing) -> Unit)? = null
}













