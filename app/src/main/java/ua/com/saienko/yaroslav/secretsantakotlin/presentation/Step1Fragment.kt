package ua.com.saienko.yaroslav.secretsantakotlin.presentation

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ua.com.saienko.yaroslav.secretsantakotlin.AppSanta
import ua.com.saienko.yaroslav.secretsantakotlin.databinding.FragmentStep1Binding
import javax.inject.Inject

class Step1Fragment : Fragment() {

    private val component by lazy {
        (requireActivity().application as AppSanta).component
    }

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[Step1ViewModel::class.java]
    }

    private var _binding: FragmentStep1Binding? = null
    private val binding: FragmentStep1Binding
        get() = _binding ?: throw RuntimeException("FragmentStep1Binding == null")

//    lateinit var listNames: MutableList<String>

    override fun onAttach(context: Context) {
        component.inject(this)
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentStep1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonGoToStep2.setOnClickListener {
            val stringNames = binding.editTextNamesOfParticipates.text.toString()
//            listNames =
//                viewModel.transformStringToList(stringNames)
//            for (name in listNames) {
//                Log.d("Step1Fragment", "$name")
//            }
            val intent = ActivityStep2.newIntent(requireActivity().application, stringNames)
            startActivity(intent)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

    }
}