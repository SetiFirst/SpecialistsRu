package com.example.specialistsru.ui.messages

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.specialistsru.R
import com.example.specialistsru.databinding.FragmentChatItemBinding
import com.example.specialistsru.databinding.FragmentMessagesListBinding
import com.example.specialistsru.ui.news.New


class ChatsAdapter: RecyclerView.Adapter<ChatsAdapter.ChatsHolder>() {
    val listOfMessages: ArrayList<Chat> = arrayListOf(
        Chat(
            R.drawable.ava,"Амогус Великий", "АМОГУС АМОГУС АМОГУС АМОГУС АМОГУС АМОГУС АМОГУС АМОГУС АМОГУС АМОГУС АМОГУС АМОГУС"
        ),
        Chat(
            R.drawable.ava,"Великий Дмитрий", "Я в своём познании настолько преисполнился, что я как будто бы уже сто триллионов миллиардов лет проживаю на триллионах и триллионах таких же планет, понимаешь, как эта Земля. Мне уже этот мир абсолютно понятен, и я здесь ищу только одного: покоя, умиротворения и вот этой гармонии от слияния с бесконечно вечным"
        )
    )

    class ChatsHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = FragmentChatItemBinding.bind(item)
        fun bind(chat: Chat) = with(binding){
            chatAvatar.setImageResource(chat.ava)
            nameText.text = chat.name
            messageText.maxLines = 2
            messageText.ellipsize = TextUtils.TruncateAt.END
            messageText.text = chat.message
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_chat_item, parent, false)
        return ChatsHolder(view)
    }

    override fun getItemCount(): Int {
        return listOfMessages.size
    }

    override fun onBindViewHolder(holder: ChatsHolder, position: Int) {
        holder.bind(listOfMessages[position])
    }
}