package com.example.specialistsru.ui.companies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.specialistsru.R
import com.example.specialistsru.databinding.FragmentCompaniesItemMiniBinding

class CompaniesHorizontalAdapter: RecyclerView.Adapter<CompaniesHorizontalAdapter.CompanyHolder>() {

    val avaList: ArrayList<CompanyItemMiniI> = arrayListOf(
        CompanyItemMiniI(R.drawable.ava)
    )

    class CompanyHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = FragmentCompaniesItemMiniBinding.bind(item)
        fun bind(miniI: CompanyItemMiniI) = with(binding) {
            companiesAvatar.setImageResource(miniI.ava)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompanyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_companies_item_mini, parent, false)
        return CompanyHolder(view)
    }

    override fun getItemCount(): Int {
        return avaList.size
    }

    override fun onBindViewHolder(holder: CompanyHolder, position: Int) {
        holder.bind(avaList[position])
    }
}