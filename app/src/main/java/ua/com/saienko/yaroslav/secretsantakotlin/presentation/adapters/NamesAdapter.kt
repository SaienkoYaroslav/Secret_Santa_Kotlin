package ua.com.saienko.yaroslav.secretsantakotlin.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ua.com.saienko.yaroslav.secretsantakotlin.databinding.NameItemBinding

class NamesAdapter : ListAdapter<String, NamesViewHolder>(NameDiffCallBack()) {

    var onClickListener: OnClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val binding = NameItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NamesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val name = getItem(position)
        holder.binding.tvItemName.text = name
        holder.binding.root.setOnClickListener {
            onClickListener?.onClick(name)
        }
    }

    interface OnClickListener {
        fun onClick(name: String)
    }

}