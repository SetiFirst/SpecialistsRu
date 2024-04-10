package com.example.specialistsru.ui.companies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.specialistsru.databinding.FragmentCompaniesHorizontalListBinding

class CompaniesHorizontalListFragment : Fragment() {

    private lateinit var binding: FragmentCompaniesHorizontalListBinding
    private val adapter = CompaniesHorizontalAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentCompaniesHorizontalListBinding.inflate(layoutInflater)
        init()
        return binding.root
    }

    private fun init() = with(binding){
        listHorizontal.adapter = adapter
        listHorizontal.layoutManager = LinearLayoutManager(
            this@CompaniesHorizontalListFragment.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }
}