package com.example.fitglow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fitglow.base.BaseFragment
import com.example.fitglow.databinding.FragmentGoalweightBinding
import com.example.fitglow.databinding.FragmentWeightBinding


class GoalweightFragment : BaseFragment<FragmentGoalweightBinding>(FragmentGoalweightBinding::inflate) {
    override fun setListener() {
        binding.GOALButton.setOnClickListener {
            findNavController().navigate(R.id.action_goalweightFragment_to_trainingLevelFragment)
        }
    }

    override fun allObserver() {

    }

}