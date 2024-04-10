package com.example.specialistsru.ui.colleagues

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.specialistsru.databinding.FragmentColleguesBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ColleguesFragment : Fragment() {
    private var _binding: FragmentColleguesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentColleguesBinding.inflate(inflater, container, false)

        val adapter = ColleaguesAdapter()

        binding.listOfColleagues.layoutManager = LinearLayoutManager(this@ColleguesFragment.context)
        binding.listOfColleagues.adapter = adapter

        CoroutineScope(Dispatchers.IO).launch {
            val list = ColleaguesViewModel().getColleguesList()
            Log.d("zxc3", "$list")
            withContext(Dispatchers.Main) {
                adapter.submitList(list)

            }
        }


        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}