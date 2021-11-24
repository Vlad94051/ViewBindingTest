package ru.tms.viewbindingtest.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.tms.viewbindingtest.R
import ru.tms.viewbindingtest.databinding.FragmentFirstBinding
import ru.tms.viewbindingtest.databinding.FragmentSecondBinding

class SecondFragment: Fragment(R.layout.fragment_second) {
    private val binding: FragmentSecondBinding by viewBinding(FragmentSecondBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }
}