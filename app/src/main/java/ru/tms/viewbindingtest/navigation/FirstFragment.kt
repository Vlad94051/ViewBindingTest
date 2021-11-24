package ru.tms.viewbindingtest.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.tms.viewbindingtest.R
import ru.tms.viewbindingtest.databinding.FragmentFirstBinding

class FirstFragment: Fragment(R.layout.fragment_first) {
    private val binding: FragmentFirstBinding by viewBinding(FragmentFirstBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }
}