package com.example.zamin.notes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zamin.notes.R
import com.example.zamin.notes.databinding.ItemNotesBinding
import com.example.zamin.notes.model.NotesData

class NotesAdapter(private val listener:onClickListener) : RecyclerView.Adapter<NotesAdapter.VH>() {
    private var list: List<NotesData> = mutableListOf()
    interface onClickListener{
        fun itemClickListener(notesData: NotesData)
    }
    inner class VH(item: View) : RecyclerView.ViewHolder(item) {
        private val bind = ItemNotesBinding.bind(item)
        fun bind(notesData: NotesData) {
            bind.apply {
                title.text = notesData.title
                text.text = notesData.text
            }
            itemView.setOnClickListener {
                listener.itemClickListener(notesData)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item_notes, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    fun setData(list: List<NotesData>) {
        this.list = list
        notifyDataSetChanged()
    }
}