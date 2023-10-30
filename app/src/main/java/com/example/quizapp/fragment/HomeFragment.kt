package com.example.quizapp.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.quizapp.R
import com.example.quizapp.adapter.CategoryAdapter
import com.example.quizapp.databinding.FragmentHomeBinding
import com.example.quizapp.model.CategoryModelClass

class HomeFragment : Fragment() {


    private  val binding: FragmentHomeBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }
    private var categoryList = ArrayList<CategoryModelClass>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        categoryList.add(CategoryModelClass(R.drawable.scince,"Science"))
        categoryList.add(CategoryModelClass(R.drawable.englishs,"English"))
        categoryList.add(CategoryModelClass(R.drawable.historyimg,"History"))
        categoryList.add(CategoryModelClass(R.drawable.mathmetic,"Mathematics"))
        binding.categoryRV.layoutManager= GridLayoutManager(requireContext(),2)
        var adapter = CategoryAdapter(categoryList)
        binding.categoryRV.adapter = adapter
        binding.categoryRV.setHasFixedSize(true)
    }

    companion object {

                }


}