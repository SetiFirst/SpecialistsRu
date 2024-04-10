package com.example.specialistsru.ui.news

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.specialistsru.R
import com.example.specialistsru.databinding.FragmentNewsBinding

class NewsFragment : Fragment() {

    private var _binding: FragmentNewsBinding? = null

    private val binding get() = _binding!!

    companion object {
        var viewedContentList: ArrayList<New> = arrayListOf()
    }

    val listOfNews: ArrayList<New> = arrayListOf(
        New(
            R.drawable.ava, "John Aboba", "All be back", 0
        ),
        New(
            R.drawable.circle, "John Not Aboba", "All be back", 1
        ),
    )


    @SuppressLint("NotifyDataSetChanged")
    fun sortOfContent(typeContent: Int){
        viewedContentList.clear()
        for(i in listOfNews) {
            if(i.type == typeContent) {
                viewedContentList.add(i)
                Log.d("Elem", i.name)
            }
        }
        Log.d("Length of news", "${viewedContentList.size}")
        newScrollingFragment.adapter.notifyDataSetChanged()
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentNewsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        sortOfContent(0)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnPosts = view?.findViewById<Button>(R.id.click_on_posts)

        Log.d("Click", "Click ${btnPosts}")
        btnPosts?.setOnClickListener {
            println("sdfg")
            sortOfContent(0)
            Log.d("Click", "Click")

        }

        val btnArticles = view?.findViewById<Button>(R.id.click_on_articles)

//        Log.d("Click", "Click ${btnPosts}")
        btnArticles?.setOnClickListener {
            println("sdfg")
            sortOfContent(1)
            Log.d("Click", "Click")

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}