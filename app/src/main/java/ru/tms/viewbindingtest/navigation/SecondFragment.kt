package ru.tms.viewbindingtest.navigation

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.tms.viewbindingtest.R
import ru.tms.viewbindingtest.databinding.FragmentSecondBinding

class SecondFragment: Fragment(R.layout.fragment_second) {
    private val binding: FragmentSecondBinding by viewBinding(FragmentSecondBinding::bind)

    val navArgs by navArgs<SecondFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btn.setOnClickListener {
            Toast.makeText(requireContext(), navArgs.info?.name.orEmpty(), Toast.LENGTH_LONG ).show()
        }
    }
}