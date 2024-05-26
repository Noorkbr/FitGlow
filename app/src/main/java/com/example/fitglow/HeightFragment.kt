package com.example.fitglow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fitglow.base.BaseFragment
import com.example.fitglow.databinding.FragmentHeightBinding


class HeightFragment : BaseFragment<FragmentHeightBinding>(FragmentHeightBinding::inflate) {
    override fun setListener() {
 binding.HeightButton.setOnClickListener {
     findNavController().navigate(R.id.action_heightFragment_to_weightFragment)
 }
    }

    override fun allObserver() {

    }

}