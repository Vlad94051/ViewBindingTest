package ru.tms.viewbindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.tms.viewbindingtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onStart() {
        super.onStart()

        binding.btn.setOnClickListener {
           Router.navigate(supportFragmentManager, MainFragment.newInstance(), R.id.container)
        }
    }
}