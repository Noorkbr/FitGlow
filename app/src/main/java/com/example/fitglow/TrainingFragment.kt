package com.example.fitglow

import com.example.fitglow.adapters.WorkoutItemAdapter
import com.example.fitglow.base.BaseFragment
import com.example.fitglow.data.WorkoutItemData
import com.example.fitglow.databinding.FragmentTrainingBinding


class TrainingFragment : BaseFragment<FragmentTrainingBinding>(FragmentTrainingBinding::inflate) {
    private lateinit var workoutItemAdapter: WorkoutItemAdapter

    val workoutsItem = listOf(
        WorkoutItemData(R.drawable.workouts_1,"Rapid Lower Body"),
        WorkoutItemData(R.drawable.workouts_2,"Bodyweight Stretch"),
        WorkoutItemData(R.drawable.workouts_3,"Core Control"),
        WorkoutItemData(R.drawable.workouts_4,"Glutes & Abs"),
        WorkoutItemData(R.drawable.workouts_1,"Rapid Lower Body"),
        WorkoutItemData(R.drawable.workouts_2,"Bodyweight Stretch"),
        WorkoutItemData(R.drawable.workouts_3,"Core Control"),
        WorkoutItemData(R.drawable.workouts_4,"Glutes & Abs"),
        WorkoutItemData(R.drawable.workouts_1,"Rapid Lower Body"),
        WorkoutItemData(R.drawable.workouts_2,"Bodyweight Stretch"),
        WorkoutItemData(R.drawable.workouts_3,"Core Control"),
        WorkoutItemData(R.drawable.workouts_4,"Glutes & Abs"),
    )
    override fun setListener() {
        workoutItemAdapter = WorkoutItemAdapter(workoutsItem)
        binding.workoutItemRecycler.adapter = workoutItemAdapter
    }

    override fun allObserver() {
    }}
