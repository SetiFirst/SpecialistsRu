package com.example.specialistsru.ui.forums

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.specialistsru.databinding.FragmentForumsBinding

class ForumsFragment : Fragment() {

    private lateinit var binding: FragmentForumsBinding
    private var adapter = ForumChatAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val forumsViewModel =
            ViewModelProvider(this).get(ForumsViewModel::class.java)

        binding = FragmentForumsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        init()
        return root
    }

    private fun init() {
        binding.apply {
            list.layoutManager = LinearLayoutManager(this@ForumsFragment.context)
            list.adapter = adapter
        }
    }
}