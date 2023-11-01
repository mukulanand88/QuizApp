package com.example.quizapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapp.R
import com.example.quizapp.adapter.HistoryAdapter
import com.example.quizapp.databinding.FragmentHistoryBinding
import com.example.quizapp.model.HistoryModelClass


class HistoryFragment : Fragment() {

    private val binding: FragmentHistoryBinding by lazy{
        FragmentHistoryBinding.inflate(layoutInflater)
    }
    private var historyList = ArrayList<HistoryModelClass>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        historyList.add(HistoryModelClass("12:30","200"))
        historyList.add(HistoryModelClass("11:35","500"))
        historyList.add(HistoryModelClass("02:20","100"))
        historyList.add(HistoryModelClass("05:10","200"))
        var adapter = HistoryAdapter(historyList)
        binding.historyRV.layoutManager = LinearLayoutManager(activity)
        binding.historyRV.setHasFixedSize(true)
        binding.historyRV.adapter = adapter
    }


}