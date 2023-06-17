package ua.com.saienko.yaroslav.secretsantakotlin.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ua.com.saienko.yaroslav.secretsantakotlin.R
import ua.com.saienko.yaroslav.secretsantakotlin.databinding.ActivityStep2Binding

class ActivityStep2 : AppCompatActivity() {

    lateinit var binding: ActivityStep2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStep2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("Name") ?: ""
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_for_step_2, Step2Fragment.newInstance(name)).commit()

    }

    companion object {
        fun newIntent(context: Context, name: String): Intent {
            val intent = Intent(context, ActivityStep2::class.java)
            intent.putExtra("Name", name)
            return intent
        }
    }
}