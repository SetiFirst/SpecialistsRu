package com.example.specialistsru.ui.forums

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.specialistsru.R
import com.example.specialistsru.databinding.FragmentChatItemBinding
import com.example.specialistsru.databinding.FragmentForumChatItemBinding

class ForumChatAdapter: RecyclerView.Adapter<ForumChatAdapter.ForumHolder>() {

    val listForumChats: ArrayList<ForumChat> = arrayListOf(
        ForumChat(
            R.drawable.ava, "Front", "Я в своем познанинии..."),
        ForumChat(
            R.drawable.ava, "Back", "... настолько преисполнился...")
    )

    class ForumHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = FragmentForumChatItemBinding.bind(item)
        fun bind(forumChat: ForumChat) = with(binding) {
            forumChatAvatar.setImageResource(forumChat.ava)
            forumNameText.text = forumChat.name
            forumMessageText.text = forumChat.message
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForumHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_forum_chat_item, parent, false)
        return ForumHolder(view)
    }

    override fun getItemCount(): Int {
        return listForumChats.size
    }

    override fun onBindViewHolder(holder: ForumHolder, position: Int) {
        holder.bind(listForumChats[position])
    }
}