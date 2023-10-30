package com.example.quizapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.databinding.ItemCategoryBinding
import com.example.quizapp.model.CategoryModelClass

class CategoryAdapter(val categoryList: ArrayList<CategoryModelClass>): RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(ItemCategoryBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount() = categoryList.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val catList = categoryList[position]
        holder.binding.catimgID.setImageResource(catList.catImg)
        holder.binding.catTxtID.text = catList.catText
    }


    inner class CategoryViewHolder(val binding: ItemCategoryBinding):
        RecyclerView.ViewHolder(binding.root)


}