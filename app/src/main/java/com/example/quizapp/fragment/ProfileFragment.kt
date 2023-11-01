package com.example.quizapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.quizapp.R
import com.example.quizapp.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    private val binding by lazy {
        FragmentProfileBinding.inflate(layoutInflater)
    }

    private var isExpand = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.downBtn.setOnClickListener {
            if(isExpand){
                binding.expandableView.visibility = View.VISIBLE
                binding.downBtn.setImageResource(R.drawable.arrowup)
            }
            else{
                binding.expandableView.visibility = View.GONE
                binding.downBtn.setImageResource(R.drawable.downarrow)

            }
            isExpand = !isExpand

        }



        return binding.root
    }


}