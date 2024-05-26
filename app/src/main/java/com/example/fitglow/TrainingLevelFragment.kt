package com.example.fitglow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.fitglow.base.BaseFragment
import com.example.fitglow.data.ListAdapter
import com.example.fitglow.data.ListData
import com.example.fitglow.databinding.FragmentTrainingLevelBinding
import com.example.fitglow.databinding.FragmentWeightBinding


class TrainingLevelFragment : BaseFragment<FragmentTrainingLevelBinding>(
    FragmentTrainingLevelBinding::inflate) {
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    val imageList = intArrayOf(
        R.drawable.yoga,
        R.drawable.cardio,
        R.drawable.power_train,
    )
    val nameList = arrayOf("Beginner", "Medium", "Advanced")
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
        binding.trainlevelButton.setOnClickListener {
                findNavController().navigate(R.id.action_trainingLevelFragment_to_chooseActivitiesFragment)


    }








    }

    override fun allObserver() {

    }

}