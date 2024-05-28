package com.example.fitglow.welcome

import androidx.navigation.fragment.findNavController
import com.example.fitglow.R
import com.example.fitglow.base.BaseFragment
import com.example.fitglow.databinding.FragmentWelcome3Binding


class WelcomeFragment3 : BaseFragment<FragmentWelcome3Binding>(FragmentWelcome3Binding::inflate) {
    override fun setListener() {
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment3_to_signupFragment)
        }
    }

    override fun allObserver() {

    }

}