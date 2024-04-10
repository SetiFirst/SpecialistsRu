package com.example.specialistsru.ui.news

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.specialistsru.R
import com.example.specialistsru.databinding.FragmentNewScrollingBinding

class newScrollingFragment : Fragment() {

    lateinit var binding: FragmentNewScrollingBinding

    companion object {
        val adapter = newScrollingAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewScrollingBinding.inflate(layoutInflater)
        init()

        return binding.root
    }

    private fun init() {
        binding.apply {
            newScrolling.layoutManager = LinearLayoutManager(this@newScrollingFragment.context)
            newScrolling.adapter = adapter
        }
    }


}