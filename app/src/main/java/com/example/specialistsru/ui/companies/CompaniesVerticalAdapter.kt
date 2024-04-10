package com.example.specialistsru.ui.companies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.specialistsru.R
import com.example.specialistsru.databinding.FragmentCompaniesItemBinding

class CompaniesVerticalAdapter: RecyclerView.Adapter<CompaniesVerticalAdapter.CompaniesHolder>() {

    val companiesFindList: ArrayList<CompanyItem> = arrayListOf(
        CompanyItem(R.drawable.ava, "АОА Аирфламе", "Вы все знаете нас через наших лучших телефонистов-звонильщиков!"),
        CompanyItem(R.drawable.ava, "ААА Мошенники", "Здравствуйте, это сбербанк! Ваш счет в опасности. Для вас ымы создали безопасный счет. Переведите на него свои средства, чтобы их обезопасить на счет: 6788789878987879")
    )
    class CompaniesHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = FragmentCompaniesItemBinding.bind(item)
        fun bind(companyItem: CompanyItem) = with(binding) {
            companiesAvatar.setImageResource(companyItem.ava)
            companiesFindNameText.text = companyItem.name
            companiesFindDescriptionText.text = companyItem.descr
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompaniesHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_companies_item, parent, false)
        return CompaniesHolder(view)
    }

    override fun getItemCount(): Int {
        return companiesFindList.size
    }

    override fun onBindViewHolder(holder: CompaniesHolder, position: Int) {
        holder.bind(companiesFindList[position])
    }
}