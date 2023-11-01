package com.example.quizapp.fragment

import android.content.IntentSender.OnFinished
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.quizapp.databinding.FragmentHistoryBinding
import com.example.quizapp.databinding.FragmentSpinBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlin.random.Random


class SpinFragment : Fragment() {
    private val binding: FragmentSpinBinding by lazy{
        FragmentSpinBinding.inflate(layoutInflater)
    }
    private lateinit var timer: CountDownTimer
    private val itemTitles = arrayOf("100", "Try Again", "500", "Try Again", "200", "Try Again")



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.coinID.setOnClickListener{
            val bottomSheetDialog: BottomSheetDialogFragment = WithdrawlFragment()
            bottomSheetDialog.show(requireActivity().supportFragmentManager,"Test")
            bottomSheetDialog.enterTransition
        }
        binding.coinValID.setOnClickListener{
            val bottomSheetDialog: BottomSheetDialogFragment = WithdrawlFragment()
            bottomSheetDialog.show(requireActivity().supportFragmentManager,"Test")
            bottomSheetDialog.enterTransition
        }
        return binding.root
    }

    private fun showResult(itemTitle: String) {
        Toast.makeText(requireContext(), itemTitle, Toast.LENGTH_LONG).show()
        binding.spinID.isEnabled = true
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.spinID.setOnClickListener {
            binding.spinID.isEnabled = false
            val spin = Random.nextInt(6)
            val degree = 60f * spin
            timer = object: CountDownTimer(5000, 50) {

                var rotation = 0f
                override fun onTick(millisUntilFinished: Long) {
                    rotation += 5f
                    if (rotation >= degree) {
                        rotation = degree
                        timer.cancel()
                        showResult(itemTitles[spin])
                    }
                    binding.wheel.rotation = rotation
                }


                override fun onFinish() {}

            }.start()
        }
    }
}


