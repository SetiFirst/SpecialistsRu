package com.example.specialistsru.ui.companies

import android.app.ActionBar.LayoutParams
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.specialistsru.databinding.FragmentCompaniesBinding

class CompaniesFragment : Fragment() {

    private lateinit var binding: FragmentCompaniesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val companiesViewModel =
            ViewModelProvider(this).get(CompaniesViewModel::class.java)

        binding = FragmentCompaniesBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        todo()
    }

    fun todo() = with(binding){

        searchBarCompanies.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                // Ничего не делаем
            } else {
                // Показываем элементы после потери фокуса EditText
                companiesFindNameTextHorizontal.visibility = View.VISIBLE
                companiesFindNameTextHorizontalLayout.visibility = View.VISIBLE
            }
        }

        searchBarCompanies.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Ничего не делаем
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Ничего не делаем
            }

            override fun afterTextChanged(s: Editable?) {
                // Если EditText пустой, показываем элементы
                if (s.toString().isEmpty()) {
                    companiesFindNameTextHorizontal.visibility = View.VISIBLE
                    companiesFindNameTextHorizontalLayout.visibility = View.VISIBLE
                }
            }
        })
    }
}