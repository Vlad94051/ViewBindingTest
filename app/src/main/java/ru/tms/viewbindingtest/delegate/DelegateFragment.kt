package ru.tms.viewbindingtest.delegate

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.tms.viewbindingtest.R
import ru.tms.viewbindingtest.databinding.FragmentMainBinding

class DelegateFragment: Fragment(R.layout.fragment_main) {

    companion object {
        fun newInstance() = DelegateFragment()
    }

    private val binding: FragmentMainBinding by viewBinding(FragmentMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.root.setOnClickListener {
            binding.title.text = "NEW TEXT"
        }
    }
}