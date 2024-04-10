package com.example.specialistsru.ui.companies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.specialistsru.databinding.FragmentCompaniesVerticalListBinding

class CompaniesVerticalListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private lateinit var binding: FragmentCompaniesVerticalListBinding
    private var adapter = CompaniesVerticalAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentCompaniesVerticalListBinding.inflate(layoutInflater)
        init()
        return binding.root
    }
    private fun init() = with(binding) {
        listVertical.adapter = adapter
        listVertical.layoutManager = LinearLayoutManager(this@CompaniesVerticalListFragment.context)
    }
}