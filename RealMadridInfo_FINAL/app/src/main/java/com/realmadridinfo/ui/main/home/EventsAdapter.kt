package com.realmadridinfo.ui.main.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.realmadridinfo.data.models.Event
import com.realmadridinfo.databinding.RvItemEventBinding

class EventsAdapter :
    RecyclerView.Adapter<EventsAdapter.DataViewHolder>() {

    inner class DataViewHolder(private val binding: RvItemEventBinding):
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Event) {
            binding.event = data
        }
    }

    private val diffCallback = object : DiffUtil.ItemCallback<Event>() {
        override fun areItemsTheSame(oldItem: Event, newItem: Event): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Event, newItem: Event): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, diffCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        return DataViewHolder(
            RvItemEventBinding.inflate(
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

    var onClick: ((Event) -> Unit)? = null
}













