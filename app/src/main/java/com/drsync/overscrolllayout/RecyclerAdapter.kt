package com.drsync.overscrolllayout

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.drsync.overscrolllayout.databinding.ItemListBinding

class RecyclerAdapter(
    private val onItemClick: () -> Unit
) : ListAdapter<String, RecyclerAdapter.ViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(private val binding: ItemListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: String) {
            binding.apply {
                binding.cvItem.backgroundTintList = ColorStateList.valueOf(Color.parseColor(data))
            }
        }
    }

    companion object {
        val DIFF_CALLBACK: DiffUtil.ItemCallback<String> =
            object : DiffUtil.ItemCallback<String>() {
                override fun areItemsTheSame(
                    oldItem: String,
                    newItem: String
                ): Boolean {
                    return oldItem == newItem
                }

                @SuppressLint("DiffUtilEquals")
                override fun areContentsTheSame(
                    oldItem: String,
                    newItem: String
                ): Boolean {
                    return oldItem == newItem
                }
            }
    }
}