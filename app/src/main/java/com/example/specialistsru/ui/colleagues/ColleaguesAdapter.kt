package com.example.specialistsru.ui.colleagues

import Colleague
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.specialistsru.R
import com.example.specialistsru.databinding.FragmentCollegauesItemBinding
import com.squareup.picasso.Picasso

class ColleaguesAdapter: ListAdapter<Colleague, ColleaguesAdapter.ColleaguesHolder>(Comparator()) {

    class ColleaguesHolder(view: View): RecyclerView.ViewHolder(view) {
        val binding = FragmentCollegauesItemBinding.bind(view)
        fun bind(colleague: Colleague) = with(binding){
            Log.d("colleagueAdapter", "$colleague")
            colleaguesName.text = colleague.firstName
            colleaguesLastname.text = colleague.lastName
            Picasso.get().load(colleague.image).into(colleagueImage)
        }
    }

    class Comparator: DiffUtil.ItemCallback<Colleague>() {
        override fun areItemsTheSame(oldItem: Colleague, newItem: Colleague): Boolean {
            return  oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Colleague, newItem: Colleague): Boolean {
            return  oldItem == newItem
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ColleaguesHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_collegaues_item, parent, false)
        return ColleaguesHolder(view)
    }

    override fun onBindViewHolder(holder: ColleaguesHolder, position: Int) {
        holder.bind(getItem(position))
    }
}