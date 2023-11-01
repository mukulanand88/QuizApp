package com.example.quizapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.databinding.ItemHistoryBinding
import com.example.quizapp.model.HistoryModelClass

class HistoryAdapter(val historyList:ArrayList<HistoryModelClass>):RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
       return HistoryViewHolder(ItemHistoryBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount(): Int {
        return historyList.size
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        var histList = historyList[position]
        holder.binding.dateandtimeTV.text = histList.dateAndtime
        holder.binding.intvalueTV.text = histList.coin
    }

    class HistoryViewHolder(val binding:ItemHistoryBinding):
            RecyclerView.ViewHolder(binding.root)
}