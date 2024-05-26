package com.example.fitglow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
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