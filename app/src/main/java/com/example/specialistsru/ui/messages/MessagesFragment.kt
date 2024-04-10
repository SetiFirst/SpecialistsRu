package com.example.specialistsru.ui.messages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.specialistsru.databinding.FragmentMessagesListBinding

class MessagesFragment : Fragment() {

    lateinit var binding: FragmentMessagesListBinding
    private val adapter = ChatsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val messagesViewModel =
            ViewModelProvider(this).get(MessagesViewModel::class.java)

        binding = FragmentMessagesListBinding.inflate(inflater, container, false)
        val root: View = binding.root
        init()
        return root
    }

    private fun init() {
        binding.apply {
            list.layoutManager = LinearLayoutManager(this@MessagesFragment.context)
            list.adapter = adapter
        }
    }
}