package com.github.siseong.art.presentation.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.siseong.art.data.AppRepositoryImpl
import com.github.siseong.art.databinding.MainFragmentLayoutBinding

class MainFragment: Fragment() {

    private val viewModel: MainFragmentViewModel = MainFragmentViewModel(
        AppRepositoryImpl()
    )
    lateinit var binding: MainFragmentLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentLayoutBinding.inflate(inflater)

        viewModel.apps.observe(viewLifecycleOwner) { apps ->
            binding.title.text = apps.first().title
        }

        return binding.root
    }
}