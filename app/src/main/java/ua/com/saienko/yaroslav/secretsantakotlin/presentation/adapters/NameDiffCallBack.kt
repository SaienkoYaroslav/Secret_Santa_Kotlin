package ua.com.saienko.yaroslav.secretsantakotlin.presentation.adapters

import androidx.recyclerview.widget.DiffUtil

class NameDiffCallBack: DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}