package ua.com.saienko.yaroslav.secretsantakotlin.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ua.com.saienko.yaroslav.secretsantakotlin.R
import ua.com.saienko.yaroslav.secretsantakotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.main_container, Step1Fragment()).commit()
    }
}