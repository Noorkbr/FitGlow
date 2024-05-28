package com.example.fitglow

import android.content.Intent
import android.widget.AdapterView
import androidx.core.content.ContextCompat
import com.example.fitglow.adapters.ListAdapter
import com.example.fitglow.base.BaseFragment
import com.example.fitglow.data.ListData
import com.example.fitglow.databinding.FragmentChooseActivitiesBinding
import com.example.fitglow.SplashScreens.SplashActivity

class chooseActivitiesFragment : BaseFragment<FragmentChooseActivitiesBinding>(FragmentChooseActivitiesBinding::inflate) {

    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    val imageList = intArrayOf(
        R.drawable.cardio,
        R.drawable.power_train,
        R.drawable.yoga,
    )
    val nameList = arrayOf("Cardio", "Power Training", "Yoga")
    override fun setListener() {
        dataArrayList.clear()
        for (i in imageList.indices) {
            listData = ListData(
                imageList[i],
                nameList[i]
            )
            dataArrayList.add(listData)
        }

        listAdapter = ListAdapter(requireContext(), dataArrayList)
        binding.listview.adapter = listAdapter
        binding.listview.isClickable = true
        binding.listview.itemsCanFocus = true

        binding.listview.onItemClickListener =
            AdapterView.OnItemClickListener { _, view, i, _ ->
                view.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.lavender))
            }

        binding.loginButton.setOnClickListener {
            startActivity(Intent(requireContext(), SplashActivity::class.java))
            requireActivity().finish()
        }

    }

    override fun allObserver() {

    }
}