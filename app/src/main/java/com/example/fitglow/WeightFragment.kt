package com.example.fitglow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fitglow.base.BaseFragment
import com.example.fitglow.databinding.FragmentWeightBinding


class WeightFragment : BaseFragment<FragmentWeightBinding>(FragmentWeightBinding::inflate) {
    override fun setListener() {
      binding.weightButton.setOnClickListener {
          findNavController().navigate(R.id.action_weightFragment_to_goalweightFragment)
      }
    }

    override fun allObserver() {

    }

}