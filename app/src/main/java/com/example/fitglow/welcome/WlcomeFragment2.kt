package com.example.fitglow.welcome

import androidx.navigation.fragment.findNavController
import com.example.fitglow.R
import com.example.fitglow.base.BaseFragment
import com.example.fitglow.databinding.FragmentWlcome2Binding


class WlcomeFragment2 : BaseFragment<FragmentWlcome2Binding>(FragmentWlcome2Binding::inflate) {
    override fun setListener() {
        binding.btnLogin.setOnClickListener {

            findNavController().navigate(R.id.action_wlcomkFragment2_to_welcomeFragment3)
        }

    }

    override fun allObserver() {

    }

}