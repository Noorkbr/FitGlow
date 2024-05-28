package com.example.fitglow.welcome

import androidx.navigation.fragment.findNavController
import com.example.fitglow.R
import com.example.fitglow.base.BaseFragment
import com.example.fitglow.databinding.FragmentWelcomeBinding


class WelcomeFragment : BaseFragment<FragmentWelcomeBinding>(FragmentWelcomeBinding::inflate) {
    override fun setListener() {
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_wlcomkFragment2)
        }

    }

    override fun allObserver() {

    }

}