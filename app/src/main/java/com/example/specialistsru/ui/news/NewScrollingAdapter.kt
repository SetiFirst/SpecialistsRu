package com.example.specialistsru.ui.news

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.example.specialistsru.R
import com.example.specialistsru.databinding.FragmentNewBinding

class newScrollingAdapter: RecyclerView.Adapter<newScrollingAdapter.NewsHolder>() {

    class NewsHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = FragmentNewBinding.bind(item)
        fun bind(new: New) = with(binding) {
            avatar.setImageResource(new.ava)
            cardName.text = new.name
            textCard.text = new.text
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {

        Log.d("Length of news m", "${NewsFragment.viewedContentList.size}")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_new, parent, false)
        return  NewsHolder(view)
    }

    override fun getItemCount(): Int {

        Log.d("ItemPositiion"," sdfg")
        Log.d("ItemPositionIs", NewsFragment.viewedContentList.size.toString())
        Log.d("Length of news j", "${NewsFragment.viewedContentList.size}")
        return NewsFragment.viewedContentList.size
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {

        Log.d("Length of news s", "${NewsFragment.viewedContentList.size}")
        Log.d("elem", "new Elem")
        holder.bind(NewsFragment.viewedContentList[position])
    }
}

