package com.example.fitglow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
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