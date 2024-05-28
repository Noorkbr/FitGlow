package com.example.fitglow

import com.example.fitglow.adapters.CategoryItemAdapter
import com.example.fitglow.adapters.ExercisesItemAdapter
import com.example.fitglow.adapters.WorkoutItemAdapter
import com.example.fitglow.base.BaseFragment
import com.example.fitglow.data.ListData
import com.example.fitglow.data.WorkoutItemData
import com.example.fitglow.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {


    private lateinit var categoryItemAdapter: CategoryItemAdapter
    private lateinit var workoutItemAdapter: WorkoutItemAdapter
    private lateinit var exercisesItemAdapter: ExercisesItemAdapter

    val categoryItem = listOf(
        ListData(R.drawable.cardio, "Cardio"),
        ListData(R.drawable.yoga, "Yoga"),
        ListData(R.drawable.power_train, "Power"),
        ListData(R.drawable.ic_stretch, "Stretch"),
        ListData(R.drawable.cardio, "Cardio"),
        ListData(R.drawable.yoga, "Yoga"),
        ListData(R.drawable.power_train, "Power"),
        ListData(R.drawable.ic_stretch, "Stretch"),
    )

    val workoutsItem = listOf(
        WorkoutItemData(R.drawable.workouts_1, "Rapid Lower Body"),
        WorkoutItemData(R.drawable.workouts_2, "Bodyweight Stretch"),
        WorkoutItemData(R.drawable.workouts_3, "Core Control"),
        WorkoutItemData(R.drawable.workouts_4, "Glutes & Abs"),
    )

    val exercisesItem = listOf(
        WorkoutItemData(R.drawable.workouts_1, "Rapid Lower Body"),
        WorkoutItemData(R.drawable.workouts_2, "Bodyweight Stretch"),
        WorkoutItemData(R.drawable.workouts_3, "Core Control"),
        WorkoutItemData(R.drawable.workouts_4, "Glutes & Abs"),
        WorkoutItemData(R.drawable.workouts_1, "Rapid Lower Body"),
        WorkoutItemData(R.drawable.workouts_2, "Bodyweight Stretch"),
        WorkoutItemData(R.drawable.workouts_3, "Core Control"),
        WorkoutItemData(R.drawable.workouts_4, "Glutes & Abs"),
    )


    override fun setListener() {
        setRecyclerData()
        setRecycler1Data()
        setRecycler2Data()

    }
    override fun allObserver() {

    }

    private fun setRecyclerData() {
        workoutItemAdapter = WorkoutItemAdapter(workoutsItem)






    }

    private fun setRecycler1Data() {
        categoryItemAdapter = CategoryItemAdapter(categoryItem)
    }

    private fun setRecycler2Data() {
        exercisesItemAdapter = ExercisesItemAdapter(exercisesItem)




    }

}
