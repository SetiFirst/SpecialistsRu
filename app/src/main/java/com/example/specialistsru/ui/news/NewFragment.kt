package com.example.specialistsru.ui.news

import android.content.Intent
import androidx.fragment.app.viewModels
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.specialistsru.R

class NewFragment : Fragment() {

    companion object {
        const val AVA = ""
        const val NAME = "Иван Иванович"
        const val TEXT = "Это пост $NAME"

    }

    private val viewModel: NewViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val newViewModel = ViewModelProvider(this).get(NewViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_new, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textCardLayout = view.findViewById<LinearLayout>(R.id.text_card_layout)
        val image = view.findViewById<ImageView>(R.id.avatar)

        val displayMetrics = DisplayMetrics()
        val displayWidth = displayMetrics.widthPixels

        image.post {
            if(image.width > 0) {
                val textCardLayoutWidth = image.width
                val textLayoutWidth = displayWidth - textCardLayoutWidth - 100

                textCardLayout.layoutParams.width = textLayoutWidth
            }
        }

        val text = view.findViewById<TextView>(R.id.text_card)
        val name = view.findViewById<TextView>(R.id.card_name)
        text.setText(arguments?.getString(TEXT))
        name.setText(arguments?.getString(NAME))

    }
}