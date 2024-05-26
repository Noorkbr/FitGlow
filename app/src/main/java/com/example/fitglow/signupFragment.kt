package com.example.fitglow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fitglow.base.BaseFragment
import com.example.fitglow.databinding.FragmentSignupBinding


class signupFragment : BaseFragment<FragmentSignupBinding>(FragmentSignupBinding::inflate) {
    override fun setListener() {
        binding.signButton.setOnClickListener {
            findNavController().navigate(R.id.action_signupFragment_to_genderFragment)

        }

    }

    override fun allObserver() {

    }

}