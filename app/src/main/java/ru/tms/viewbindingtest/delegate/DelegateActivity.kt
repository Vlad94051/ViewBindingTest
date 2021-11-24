package ru.tms.viewbindingtest.delegate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.tms.viewbindingtest.R
import ru.tms.viewbindingtest.Router
import ru.tms.viewbindingtest.databinding.ActivityDelegateBinding

class DelegateActivity: AppCompatActivity(R.layout.activity_delegate) {
    private val binding: ActivityDelegateBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.btn.setOnClickListener {
            Router.navigate(supportFragmentManager, DelegateFragment.newInstance(), R.id.container)
        }
    }
}