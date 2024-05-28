package com.example.fitglow

import android.widget.AdapterView
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.fitglow.adapters.ListAdapter
import com.example.fitglow.base.BaseFragment
import com.example.fitglow.data.ListData
import com.example.fitglow.databinding.FragmentGenderBinding

class GenderFragment : BaseFragment<FragmentGenderBinding>(FragmentGenderBinding::inflate) {
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    val imageList = intArrayOf(
        R.drawable.ic_man,
        R.drawable.ic_woman,
        R.drawable.ic_neutral,
    )
    val nameList = arrayOf("Man", "Woman", "Gender Neutral")
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

        binding.gendercontinue.setOnClickListener {
            findNavController().navigate(R.id.action_genderFragment_to_heightFragment)
        }
    }

    override fun allObserver() {

    }

}